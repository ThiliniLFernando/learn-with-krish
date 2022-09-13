import { Injectable, Inject} from '@nestjs/common';
import { ClientKafka } from '@nestjs/microservices';
import { map, Observable } from 'rxjs';
import { OrderAllocateEvent } from './order-allocate.event';
import { OrderScheduleEvent } from './order-schedule.event';

@Injectable()
export class AppService {
  
  private static fuelStock: {fuelId:string,stock:number}[] = [
    { "fuelId": "Octane A", "stock":1000 },
    { "fuelId": "Octane B", "stock":1000 },
    { "fuelId": "Octane C", "stock":1000 }
  ]

  constructor(
    @Inject('SCHEDULE_SERVICE') private readonly scheduleClient: ClientKafka,
  ){}

  getHello(): string {
    return 'Hello World!';
  }

  allocateOrder(orderAllocation: OrderAllocateEvent){
    const fuel = AppService.fuelStock.find((obj)=>{
      return obj.fuelId = orderAllocation.fuelType;
    });

    console.log(fuel);
    if(orderAllocation.requestQty<= fuel.stock){
      fuel.stock = fuel.stock - orderAllocation.requestQty;
      AppService.fuelStock.push(fuel);
      return this.scheduleClient.send('fuel.order.schedule',new OrderScheduleEvent(orderAllocation.orderId,orderAllocation.stationId,orderAllocation.requestQty,orderAllocation.fuelType,orderAllocation.requestDate,new Date(),'ORDER SENT FOR SCHEDULE'))
      .pipe(map( msg => {
        return '{"status":1,"msg":"'+msg+'"}';
      }));
      
    } else{
      console.log('unable to proceed the order');
      return '{"status":0,"msg":"Sorry! We dont have enough stock to process your order. Avalilable stock is '+fuel.stock+'"}';
    }
  }
}

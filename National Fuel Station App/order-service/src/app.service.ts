import { Injectable,Inject } from '@nestjs/common';
import { ClientKafka } from '@nestjs/microservices';
import { map } from 'rxjs';
import { OrderAllocateEvent } from './order-allocate.event';
import { OrderRequestedEvent } from './order-requested.event';

@Injectable()
export class AppService {

  data!:string;

  constructor(
    @Inject('ALLOCATE_SERVICE') private readonly allocateClient: ClientKafka,

  ){}

  getOrder(): string{
    return 'get order';
  }

  createOrder(stationId:string,qty:number): string {
    return 'Hello World!';
  }

  async handleOrderRequested(ore:OrderRequestedEvent){
    var orderId = new Date().getTime().toString(36);
    return this.allocateClient.send('fuel.order.allocation',new OrderAllocateEvent(orderId,ore.stationId,ore.requestQty,ore.fuelType,ore.requestDate,'ORDER CREATED'))
    .pipe(map( msg => {
      return msg;
    }));
  }

}

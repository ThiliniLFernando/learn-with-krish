import { Inject, Injectable,Post } from '@nestjs/common';
import { ClientKafka } from '@nestjs/microservices/client';
import { map } from 'rxjs';
import { OrderRequestedEvent } from './order-requested.event';
import { Order } from './order.entity';
import { RequestOrder } from './request-order.dto';
import { Repository } from 'typeorm'
import { InjectRepository } from '@nestjs/typeorm';

@Injectable()
export class AppService {

  constructor(
    @Inject('ORDER_SERVICE') private readonly orderClient : ClientKafka,
    @InjectRepository(Order) private orderRepo: Repository<Order>,
  ){}

  requestOrder({stationId, requestQty, fuelType}: RequestOrder){
    return this.orderClient.send('fuel.order.request',new OrderRequestedEvent(stationId,requestQty,fuelType,new Date()))
    .pipe(map( msg => {
      return msg;
    }));
  }

  async searchOrderStatus(orderId:string){
    let str:string = (await this.orderRepo.findOneBy({orderId})).status;
    return '{"msg":"'+str+'"}';
  }

  async confirmOrderReceived(orderId:string){
    await this.orderRepo
    .createQueryBuilder()
    .update(Order)
    .set({status:"ORDER RECEIVED"})
    .where("orderId=:orderId",{orderId:orderId})
    .execute();
    return '{"msg":"Order Confirmed"}';
  }

  dispatchOrder(orderId:string){
    this.orderRepo
    .createQueryBuilder()
    .delete()
    .from(Order)
    .where("orderId=:orderId",{orderId:orderId})
    .execute();
    return '{"msg":"Order Deleted"}';
  }

  getAllOrderDetails(stationId:string){
    return this.orderRepo.findBy({stationId});
  }


}

import { Injectable } from '@nestjs/common';
import { InjectRepository } from '@nestjs/typeorm';
import { stat } from 'fs';
import { Repository } from 'typeorm';
import { FuelOrder } from './fuel-order.dto';
import { OrderScheduleEvent } from './order-schedule.event';
import { Order } from './order.entity';

@Injectable()
export class AppService {

  constructor(
    @InjectRepository(Order) private orderRepo: Repository<Order>,
  ){}

  private static fuelOrders: FuelOrder[] = [];
  
  scheduleOrder(orderSchedule: OrderScheduleEvent){
    const orderId: string = orderSchedule.orderId;
    var reqDate:Date = orderSchedule.requestDate;
    var scheduleDate:Date = new Date(reqDate);
    let ranNum = Math.round(Math.random()*4+1);
    scheduleDate.setDate(scheduleDate.getDate()+ranNum);
    // const fo:FuelOrder = new FuelOrder();
    // fo.orderId = orderSchedule.orderId;
    // fo.stationId = orderSchedule.stationId;
    // fo.fuelType = orderSchedule.fuelType;
    // fo.requestQty = orderSchedule.requestQty;
    // fo.requestDate = orderSchedule.requestDate;
    // fo.allocationDate = orderSchedule.allocationDate;
    // fo.scheduleDate = scheduleDate;
    // fo.status = 'ORDER SCHEDULED';
    // AppService.fuelOrders.push(fo);
    this.print();
    let order:Order = new Order();
    order.orderId = orderSchedule.orderId;
    order.stationId = orderSchedule.stationId;
    order.fuelType = orderSchedule.fuelType;
    order.requestQty = orderSchedule.requestQty;
    order.requestDate = orderSchedule.requestDate;
    order.allocationDate = orderSchedule.allocationDate;
    order.scheduleDate = scheduleDate;
    order.status = 'ORDER SCHEDULED';
    this.orderRepo.save(order);
    return "Success! Please use this "+orderId+" order id to track your order.";
  }

  searchOrderStatus(key:string){
    let status:string = "";
    const orderObj = AppService.fuelOrders.find((obj)=>{
      return obj.orderId = key;
    });
    if(orderObj !== undefined) status = orderObj.status;
    return status;
  }

  print(){
    AppService.fuelOrders.forEach((or) => {
      console.log(or.orderId +' '+or.scheduleDate);
    });
  }

}

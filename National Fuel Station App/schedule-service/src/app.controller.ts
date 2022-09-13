import { Controller, Get, Inject } from '@nestjs/common';
import { ClientKafka, MessagePattern } from '@nestjs/microservices';
import { AppService } from './app.service';

@Controller()
export class AppController {
  constructor(private readonly appService: AppService) {}

  @MessagePattern('fuel.order.schedule')
  scheduleOrder(data:any){
    return this.appService.scheduleOrder(data);
  }

  @MessagePattern('fuel.order.status.search')
  searchOrderStatus(key:string){
    return this.appService.searchOrderStatus(key);
  }

}

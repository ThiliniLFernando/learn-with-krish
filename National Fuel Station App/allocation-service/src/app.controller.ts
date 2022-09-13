import { Controller, Get, Inject, OnModuleInit } from '@nestjs/common';
import { ClientKafka, MessagePattern } from '@nestjs/microservices'
import { AppService } from './app.service';

@Controller()
export class AppController implements OnModuleInit{
  constructor(private readonly appService: AppService,
    @Inject('SCHEDULE_SERVICE') private readonly scheduleClient: ClientKafka) {}

  @MessagePattern('fuel.order.allocation')
  allocateOrder(data:any){
    return this.appService.allocateOrder(data);
  }

  onModuleInit() {
    this.scheduleClient.subscribeToResponseOf('fuel.order.schedule') ;  
  }
}

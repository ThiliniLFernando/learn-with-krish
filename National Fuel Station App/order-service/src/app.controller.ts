import { Controller, Get, OnModuleInit, Inject} from '@nestjs/common';
import { ClientKafka, EventPattern, MessagePattern, Payload } from '@nestjs/microservices';
import { AppService } from './app.service';

@Controller()
export class AppController implements OnModuleInit{
  constructor(
    private readonly appService: AppService,
    @Inject('ALLOCATE_SERVICE') private readonly allocateClient: ClientKafka
    ) {}

  @MessagePattern('fuel.order.request')
  handleOrderRequested(data:any){
    return this.appService.handleOrderRequested(data);
  }

  onModuleInit() {
   this.allocateClient.subscribeToResponseOf('fuel.order.allocation') ;
  }
  
}


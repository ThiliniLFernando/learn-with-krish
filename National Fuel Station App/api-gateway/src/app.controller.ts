import { Body, Controller, Get, Post,Inject,OnModuleInit,Param,Patch, Delete} from '@nestjs/common';
import { ClientKafka, MessagePattern } from '@nestjs/microservices';
import { AppService } from './app.service';
import { RequestOrder } from './request-order.dto';
import { SearchOrderStatus } from './search-order-status.event';

@Controller('order')
export class AppController implements OnModuleInit {
  constructor(private readonly appService: AppService,
    @Inject('ORDER_SERVICE') private readonly orderClient: ClientKafka) {}

  @Post()
  requestOrder(@Body() requestOrder: RequestOrder){
    console.log(requestOrder);
    if(requestOrder.requestQty<=0){
      return '{"status":0,"msg":"Please enter valid amount"}';
    }else if(requestOrder.stationId == null && requestOrder.stationId.trim.length <= 0){
      return '{"status":0,"msg":"Please log in to the system."}';
    }else {
      return this.appService.requestOrder(requestOrder);
    }
  }

  @Post('confirm')
  testRequest(@Body() ro:string){
    return "Hello World";
  }

  @Get('status/:id')
  searchOrderStatus(@Param('id') id:string){
    return this.appService.searchOrderStatus(id);
  }

  @Patch('confirm/:id')
  confirmOrderReceived(@Param('id') id:string){
    return this.appService.confirmOrderReceived(id);
  }

  @Get(':stationId')
  getAllTheOrderDetails(@Param('stationId') id:string){
    return this.appService.getAllOrderDetails(id);
  }

  @Delete(':id')
  dispatchOrder(@Param('id') id:string){
    console.log(id);
    return this.appService.dispatchOrder(id);
  }

  onModuleInit() {
      this.orderClient.subscribeToResponseOf('fuel.order.request');
  }
  
}

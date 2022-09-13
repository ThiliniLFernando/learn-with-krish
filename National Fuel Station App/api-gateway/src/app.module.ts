import { Module } from '@nestjs/common';
import { ClientsModule, Transport } from '@nestjs/microservices';
import { AppController } from './app.controller';
import { AppService } from './app.service';
import { Order } from './order.entity';
import { OrderModule } from './order/order.module';
import { TypeOrmModule } from '@nestjs/typeorm';

@Module({
  imports: [
    ClientsModule.register([
      {
        name:'ORDER_SERVICE',
        transport: Transport.KAFKA,
        options:{
          client:{
            clientId:'order',
            brokers: ['localhost:9092']
          },
          consumer:{
            groupId:'order-consumer',
          }
        }
      }
    ]),
    TypeOrmModule.forFeature([Order]),
    OrderModule,
  ],
  controllers: [AppController],
  providers: [AppService],
})
export class AppModule {}

import { Module } from '@nestjs/common';
import { ClientsModule, Transport } from '@nestjs/microservices';
import { AppController } from './app.controller';
import { AppService } from './app.service';

@Module({
  imports: [
    ClientsModule.register([
      {
        name: 'SCHEDULE_SERVICE',
        transport: Transport.KAFKA,
        options:{
          client:{
            clientId: 'schedule',
            brokers:['localhost:9092'],
          },
          consumer:{
            groupId: 'schedule-consumer'
          }
        }
      },
    ]),
  ],
  controllers: [AppController],
  providers: [AppService],
})
export class AppModule {}

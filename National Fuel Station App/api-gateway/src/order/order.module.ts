import { Module } from '@nestjs/common';
import { TypeOrmModule } from '@nestjs/typeorm';
import { Order } from 'src/order.entity';

@Module({
    imports:[
        TypeOrmModule.forRoot({
            type:'mysql',
            host:'localhost',
            port:3306,
            username:'root',
            password:'1234',
            database:'fuelstation',
            entities:[Order],
            synchronize:false,
          }),
    ]
})
export class OrderModule {}

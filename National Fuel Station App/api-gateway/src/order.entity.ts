import { Column, Entity, PrimaryGeneratedColumn } from "typeorm";

@Entity()
export class Order{

    @PrimaryGeneratedColumn()
    orderId:string;

    @Column()
    stationId:string;

    @Column()
    fuelType:string;

    @Column()
    requestQty:number;

    @Column()
    allocationDate:Date;

    @Column()
    requestDate:Date;

    @Column()
    scheduleDate:Date;

    @Column()
    status:string;
}
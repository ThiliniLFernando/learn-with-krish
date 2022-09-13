import { Component, OnInit} from '@angular/core';
import { CreateOrderService } from './create-order.service';

@Component({
  selector: 'app-create-order',
  templateUrl: './create-order.component.html',
  styleUrls: ['./create-order.component.css']
})
export class CreateOrderComponent implements OnInit {
  msg!:string;

  constructor(private orderService: CreateOrderService) { }

  ngOnInit(): void {}

  createOrder(fuelType:string,qty:string):void{
    this.orderService.requestOrder(fuelType,qty).subscribe({
      next: data=> {
        let jsonStr = JSON.stringify(data);
        let jsonObj = JSON.parse(jsonStr);
        this.msg = jsonObj.msg;
      },
    });
    console.log(this.msg);
  }
  
}

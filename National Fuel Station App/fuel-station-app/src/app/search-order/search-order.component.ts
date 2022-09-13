import { Component, OnInit } from '@angular/core';
import { SearchOrderService } from './search-order.service';

@Component({
  selector: 'app-search-order',
  templateUrl: './search-order.component.html',
  styleUrls: ['./search-order.component.css']
})
export class SearchOrderComponent implements OnInit {

  respMsg!: string;

  constructor(private searchOrder: SearchOrderService) { }

  ngOnInit(): void {
  }

  searchOrderStatus(orderKey: string) {
    if (orderKey !== null && orderKey !== undefined && orderKey.trim() !== "") {
      this.searchOrder.searchOrderStatus(orderKey).subscribe({
        next: data => {
          let jsonStr = JSON.stringify(data);
          let jsonObj = JSON.parse(jsonStr);
          this.respMsg = jsonObj.msg;
        },
      });
    }else{
      this.respMsg = "Please enter order key for search order status";
    }
  }

  confirmOrderReceived(orderKey:string){
    if (orderKey !== null && orderKey !== undefined && orderKey.trim() !== "") {
      this.searchOrder.confirmOrderReceived(orderKey).subscribe({
        next: data => {
          let jsonStr = JSON.stringify(data);
          let jsonObj = JSON.parse(jsonStr);
          this.respMsg = jsonObj.msg;
        },
      });
    }else{
      this.respMsg = "Please enter order key for search order status";
    }
  }

}

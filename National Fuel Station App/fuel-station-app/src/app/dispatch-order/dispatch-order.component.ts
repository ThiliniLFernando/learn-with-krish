import { Component, OnInit, Input } from '@angular/core';
import { TableContainerService } from '../table-container/table-container.service';
import { DispatchOrderService } from './dispatch-order.service';

@Component({
  selector: 'app-dispatch-order',
  templateUrl: './dispatch-order.component.html',
  styleUrls: ['./dispatch-order.component.css']
})
export class DispatchOrderComponent implements OnInit {

  @Input() orderKey!: any;

  constructor(private dService: DispatchOrderService, private tbService: TableContainerService) { }

  ngOnInit(): void {
  }

  dispatchOrder() {
    this.dService.dispatchOrder(this.orderKey).subscribe({
      next: data => {
        let jsonStr = JSON.stringify(data);
        let jsonObj = JSON.parse(jsonStr);
        alert(jsonObj.msg);
      }
    });
  }

}

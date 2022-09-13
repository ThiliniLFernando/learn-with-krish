import { Component, OnInit } from '@angular/core';
import { TableContainerService } from './table-container.service';

@Component({
  selector: 'app-table-container',
  templateUrl: './table-container.component.html',
  styleUrls: ['./table-container.component.css']
})
export class TableContainerComponent implements OnInit {

  orders!:any;

  constructor(private table: TableContainerService) { }

  ngOnInit(): void {
    this.getAllOrders();
  }

  getAllOrders() {
    return this.table.getAllOrders().subscribe({
      next: data => {
        this.orders = data;
      }
    });
  }

}

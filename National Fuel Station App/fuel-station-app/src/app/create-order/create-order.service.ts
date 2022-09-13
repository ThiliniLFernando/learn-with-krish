import { HttpClient } from '@angular/common/http';
import { Injectable } from '@angular/core';
import { Observable } from 'rxjs';

@Injectable({
  providedIn: 'root'
})
export class CreateOrderService {
  private http: string = 'http://localhost:3000/order/';

  constructor(private httpClient: HttpClient) { }

  requestOrder(fuelType: string, qty: string): Observable<string> {
    console.log("Create Order Service");
    const param = '{"stationId":"1234","fuelType":"' + fuelType + '","requestQty":' + Number(qty) + '}';
    return this.httpClient.post<string>(this.http, JSON.parse(param));
  }
  
}

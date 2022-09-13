import { HttpClient, HttpParams } from '@angular/common/http';
import { Injectable } from '@angular/core';
import { Observable } from 'rxjs';

@Injectable({
    providedIn: 'root'
})
export class DispatchOrderService {

    private http: string = 'http://localhost:3000/order/';

    constructor(private httpClient: HttpClient) { }

    dispatchOrder(orderKey:string):Observable<string>{
        console.log("Delete Order Status "+ orderKey);
        return this.httpClient.delete<string>(this.http+""+orderKey+"/");
    }

}

import { HttpClient, HttpParams } from '@angular/common/http';
import { Injectable } from '@angular/core';
import { Observable } from 'rxjs';

@Injectable({
    providedIn: 'root'
})
export class SearchOrderService {

    private http: string = 'http://localhost:3000/order/status/';
    private confirmHttp:string = 'http://localhost:3000/order/confirm/';

    constructor(private httpClient: HttpClient) { }

    searchOrderStatus(orderKey: string): Observable<string> {
        console.log("Search Order Status "+ orderKey);
        return this.httpClient.get<string>(this.http +""+ orderKey.trim()+"/");
    }

    confirmOrderReceived(orderKey:string):Observable<string>{
        console.log("Confirm Order Status "+ orderKey);
        let params = new HttpParams();
        params.set('key', orderKey);
        return this.httpClient.patch<string>(this.confirmHttp +""+ orderKey.trim()+"/",params);
    }

}

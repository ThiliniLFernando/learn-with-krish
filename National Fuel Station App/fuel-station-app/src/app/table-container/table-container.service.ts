import { HttpClient, HttpParams } from '@angular/common/http';
import { Injectable } from '@angular/core';
import { Observable } from 'rxjs';

@Injectable({
    providedIn: 'root'
})
export class TableContainerService {

    private http: string = 'http://localhost:3000/order/1234';

    constructor(private httpClient: HttpClient) { }

    getAllOrders() {
        return this.httpClient.get(this.http);
    }

}

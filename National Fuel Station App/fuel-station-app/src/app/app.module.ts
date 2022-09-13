import { NgModule } from '@angular/core';
import { BrowserModule } from '@angular/platform-browser';
import {HttpClient, HttpClientModule} from '@angular/common/http'

import { AppRoutingModule } from './app-routing.module';
import { AppComponent } from './app.component';
import { NavigationComponent } from './navigation/navigation.component';
import { CreateOrderComponent } from './create-order/create-order.component';
import { SearchOrderComponent } from './search-order/search-order.component';
import { AllOrdersComponent } from './all-orders/all-orders.component';
import { DispatchOrderComponent } from './dispatch-order/dispatch-order.component';
import { FuelOrderComponent } from './fuel-order/fuel-order.component';
import { TableFilterComponent } from './table-filter/table-filter.component';
import { TableContainerComponent } from './table-container/table-container.component';

@NgModule({
  declarations: [
    AppComponent,
    NavigationComponent,
    CreateOrderComponent,
    SearchOrderComponent,
    AllOrdersComponent,
    DispatchOrderComponent,
    FuelOrderComponent,
    TableFilterComponent,
    TableContainerComponent
  ],
  imports: [
    BrowserModule,
    AppRoutingModule,
    HttpClientModule
  ],
  providers: [],
  bootstrap: [AppComponent]
})
export class AppModule { }

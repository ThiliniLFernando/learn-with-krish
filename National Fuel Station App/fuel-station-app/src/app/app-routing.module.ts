import { NgModule } from '@angular/core';
import { RouterModule, Routes } from '@angular/router';
import { AllOrdersComponent } from './all-orders/all-orders.component';
import { FuelOrderComponent } from './fuel-order/fuel-order.component';

const routes: Routes = [
  {path:'app-fuel-order',component:FuelOrderComponent},
  {path:'app-all-orders',component:AllOrdersComponent},
  {path: '', redirectTo: '/app-fuel-order', pathMatch: 'full'},
];

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule { }

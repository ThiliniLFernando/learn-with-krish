import { ComponentFixture, TestBed } from '@angular/core/testing';

import { FuelOrderComponent } from './fuel-order.component';

describe('FuelOrderComponent', () => {
  let component: FuelOrderComponent;
  let fixture: ComponentFixture<FuelOrderComponent>;

  beforeEach(async () => {
    await TestBed.configureTestingModule({
      declarations: [ FuelOrderComponent ]
    })
    .compileComponents();

    fixture = TestBed.createComponent(FuelOrderComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});

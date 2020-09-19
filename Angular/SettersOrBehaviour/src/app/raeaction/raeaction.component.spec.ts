import { ComponentFixture, TestBed } from '@angular/core/testing';

import { RaeactionComponent } from './raeaction.component';

describe('RaeactionComponent', () => {
  let component: RaeactionComponent;
  let fixture: ComponentFixture<RaeactionComponent>;

  beforeEach(async () => {
    await TestBed.configureTestingModule({
      declarations: [ RaeactionComponent ]
    })
    .compileComponents();
  });

  beforeEach(() => {
    fixture = TestBed.createComponent(RaeactionComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});

import { BrowserModule } from '@angular/platform-browser';
import { NgModule } from '@angular/core';

import { AppRoutingModule } from './app-routing.module';
import { AppComponent } from './app.component';
import { ParentComponent } from './parent/parent.component';
import { TriggerComponent } from './trigger/trigger.component';
import { RaeactionComponent } from './raeaction/raeaction.component';
import { BehaviouralService } from './service/behavioural.service';
import { FormsModule } from '@angular/forms';

@NgModule({
  declarations: [
    AppComponent,
    ParentComponent,
    TriggerComponent,
    RaeactionComponent
  ],
  imports: [
    BrowserModule,
    AppRoutingModule,
    FormsModule
  ],
  providers: [BehaviouralService],
  bootstrap: [AppComponent]
})
export class AppModule { }

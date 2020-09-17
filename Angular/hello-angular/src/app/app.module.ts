import { BrowserModule } from '@angular/platform-browser';
import { NgModule } from '@angular/core';

import {FormsModule } from '@angular/forms';

import { AppRoutingModule } from './app-routing.module';
import { AppComponent } from './app.component';
import { TestComponent } from './test/test.component';
import { PlanetListComponent } from './planet-list/planet-list.component';
import { PrependPipe } from './shared/prepend.pipe';
import { PlanetGeneratorService } from './shared/planet-generator.service';
import { StarsComponent } from './shared/stars/stars.component';
import { ColorDirectiveDirective } from './shared/color-directive.directive';
import { WelcomeComponent } from './welcome/welcome.component';
import { ProfileComponent } from './profile/profile.component';

//This is a decorator in Angular, looks like an annotation in Java. 
//Speficially the "NgModule" decorator 
@NgModule({
  declarations: [ // used for declaring components (and pipes)
    AppComponent, TestComponent, PlanetListComponent, PrependPipe, StarsComponent, ColorDirectiveDirective, WelcomeComponent, ProfileComponent
  ],
  imports: [ // used to import external modules 
    BrowserModule,
    AppRoutingModule,
    FormsModule
  ],
  providers: [ //used to declare services, the provider essentilally tells the Injector which object it needs to create & maintain
    PlanetGeneratorService


  ],
  bootstrap: [AppComponent]
})
export class AppModule { }

import { componentFactoryName } from '@angular/compiler';
import { NgModule } from '@angular/core';
import { Routes, RouterModule } from '@angular/router';
import { PlanetListComponent } from './planet-list/planet-list.component';
import { ProfileComponent } from './profile/profile.component';
import { WelcomeComponent } from './welcome/welcome.component';

const routes: Routes = [

  {
    path: 'welcome',
    component: WelcomeComponent
  },
  {
    path: 'planets',
    component: PlanetListComponent
  },
  {
    path: 'profile/:myPathVariable',
    component: ProfileComponent
  },
  {
    path: 'p',
    redirectTo: 'planets'
  },
  {
    path: '**',
    redirectTo: 'welcome',
    pathMatch: 'full'
  }

];

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule { }

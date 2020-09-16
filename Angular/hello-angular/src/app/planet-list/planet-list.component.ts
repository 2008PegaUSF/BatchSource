import { Component, OnInit } from '@angular/core';
import { Planet } from './planet';

@Component({
  selector: 'app-planet-list',
  templateUrl: './planet-list.component.html',
  styleUrls: ['./planet-list.component.css']
})
export class PlanetListComponent  {

  //used to demo interpolation in the HTML page
  currentUser = 'Venus';

  //used to demo *ngIf
  showTable: boolean = true;

   // dealing with the images
   imageWidth = 100;
   imageMargin = 2;
   showImage = false;

  //used to demo 2-way binding 
  actualInputField = '';

  get inputField(){
    return this.actualInputField;
  }

  set inputField(temp: string){
    this.actualInputField = temp;
  }

  planets: Planet[];

  constructor() {

    this.planets = [
            {
              name: 'Earth',
              image: 'placeholder',
              livibility: 5
            },
            {
              name: 'Mars',
              image: 'placeholder',
              livibility: 3
            },
            {
              name: 'Venus',
              image: 'placeholder',
              livibility: 4
            },
            {
              name: 'Jupiter',
              image: 'placeholder',
              livibility: 1
            }

    ]

   }

  

}

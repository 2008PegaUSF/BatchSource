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

   toggleImage(){
     this.showImage = !this.showImage;
   }

  //used to demo 2-way binding and creating a filter 
  actualInputField = '';

  get inputField(){
    return this.actualInputField;
  }

  set inputField(temp: string){
    this.actualInputField = temp;
    
    this.filteredPlanets = this.actualInputField?
        this.performFilter(this.inputField): this.planets;
  }

performFilter(filterValue: string): Planet[]{

  filterValue = filterValue.toLocaleLowerCase();

  return this.planets.filter(

    (planet: Planet) => planet.name.toLocaleLowerCase().indexOf(filterValue)!= -1);
  
}

  planets: Planet[];
  filteredPlanets: Planet[];

  constructor() {

    this.planets = [
            {
              name: 'Earth',
              image: 'https://images.unsplash.com/photo-1564053489984-317bbd824340?ixlib=rb-1.2.1&auto=format&fit=crop&w=2014&q=80',
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
            },
            {
              name: 'Mercury',
              image: 'http://dreamicus.com/data/mercury/mercury-06.jpg',
              livibility: 2
            }

    ]

    this.filteredPlanets = this.planets;

   }

  

}

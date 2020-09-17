import { Component, Injectable, OnInit } from '@angular/core';
import { PlanetGeneratorService } from '../shared/planet-generator.service';
import { Planet } from './planet';

/**
 * The injecto will AUTOMATIOCALLY check any calss with @Compnonet above it, so having @Injectable() above is 
 *  redundant. 
 */
@Injectable()
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

  //used to demo star event
  starEventString: string;

  starEventWasTriggered(temp: string): void{
    this.starEventString = temp;
  }

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

  

  constructor(private planetList: PlanetGeneratorService) {

    /**
     * There is an entity inside of Angular called "The Injector", this injector entity will create objects of all the services
     * your provide it and WHENEVER it sees a constructor w/ a parameter of the SAME type as an object the Injector contains then 
     * the inject will inject the object into the contructor 
     */

    this.planets = planetList.getPlanets();
    this.filteredPlanets = this.planets;

   }

  

}

import { Injectable } from '@angular/core';
import { Planet } from '../planet-list/planet';


/**
 * What is a service?
 * In short, a service is a modularized functionality. We put some functionality into another class
 * so that it can be easily accessible by MANY other classes. (reducing redundant code)
 * 
 * To create a service in Angular we need to :
 * 1. Create a TS class 
 * 2. Register that service in the PROVIDERS attribute of the module.ts 
 * 
 * 
 * 
 * @Injectable() is needed above a class that NEEDS a service, NOT the service itself. 
 * 
 * @Injectable() actually is convention 
 * 
 */
export class PlanetGeneratorService {

  getPlanets(): Planet[] {
    
    return  [{
      name: 'Earth',
      image: 'https://images.unsplash.com/photo-1564053489984-317bbd824340?ixlib=rb-1.2.1&auto=format&fit=crop&w=2014&q=80',
      livibility: 5
    },
    {
      name: 'Mars',
      image: 'https://upload.wikimedia.org/wikipedia/commons/0/02/OSIRIS_Mars_true_color.jpg',
      livibility: 3
    },
    {
      name: 'Venus',
      image: 'https://upload.wikimedia.org/wikipedia/commons/a/a9/PIA23791-Venus-NewlyProcessedView-20200608.jpg',
      livibility: 4
    },
    {
      name: 'Jupiter',
      image: 'https://upload.wikimedia.org/wikipedia/commons/2/2b/Jupiter_and_its_shrunken_Great_Red_Spot.jpg',
      livibility: 1
    },
    {
      name: 'Mercury',
      image: 'http://dreamicus.com/data/mercury/mercury-06.jpg',
      livibility: 2
    }

  ]

  }

  constructor() { }
}

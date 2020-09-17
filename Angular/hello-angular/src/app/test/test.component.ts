import { Component, OnInit } from '@angular/core';
import { Planet } from '../planet-list/planet';
import { PlanetGeneratorService } from '../shared/planet-generator.service';

@Component({
  selector: 'app-test',
  templateUrl: './test.component.html',
  styleUrls: ['./test.component.css']
})
export class TestComponent implements OnInit {

  planets: Planet[];
  constructor( private planetList: PlanetGeneratorService) {

    this.planets = planetList.getPlanets();

   }

  ngOnInit(): void {
  }

}

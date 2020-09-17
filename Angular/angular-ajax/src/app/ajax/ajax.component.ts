import { Component, OnInit } from '@angular/core';
import { PokemonService } from '../services/pokemon.service';

@Component({
  selector: 'app-ajax',
  templateUrl: './ajax.component.html',
  styleUrls: ['./ajax.component.css']
})
export class AjaxComponent {

  pokeName: string;
  pokeId: number;
  pokeImageUrl: string;

  pokeButtonClicked(){ //messier way 
    console.log("poke button is working!")

    

    this.pokeService.setUrl(this.pokeId);

    console.log(this.pokeService.getUrl);

    this.pokeService.capturePokemon().subscribe(
      (data) => {
        //the data parameter is the JSON that comes back from the AJAX request

        console.log(data)
        const ourField1 = 'name'
        const ourField2 = 'sprites';
        const ourField3 = 'front_default';

        let tempArray: object; //all the sprites 

        this.pokeName = data[ourField1];
        tempArray = data[ourField2];
        this.pokeImageUrl = tempArray[ourField3];
      } 




    )

  }

  pokeButtonClickedReloaded(){ //slightly cleaner way 
    this.pokeService.setUrl(this.pokeId);

    this.pokeService.capturePokemonReloaded().subscribe(
      (data) => {
        const ourField = 'front_default';
        this.pokeName = data.name;
        this.pokeImageUrl = data.sprites[ourField];
      }
    )
  }
  constructor(private pokeService: PokemonService) { }

}

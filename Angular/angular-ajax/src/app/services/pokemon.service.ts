import { HttpClient } from '@angular/common/http';
import { Injectable } from '@angular/core';
import { Observable } from 'rxjs';

export interface Pokes {
  'base_experience': number;
  'id': number;
  'name': string;
  'sprites': object;
}


/**
 * 
 * What is RXJS?
 *    -Reactive Extension JavaScript 
 *    -IT contains objects like Observables, BehavioralSubjects, Promises, etc. 
 *    - RxJs has tools to make asynchronous and callbakc functionalities simpler. 
 */

@Injectable({
  providedIn: 'root'
})
export class PokemonService {

  private baseUrl = 'https://pokeapi.co/api/v2/pokemon/';
  private url = '';

  get getUrl(): string{
    return this.url;
  }

  constructor(private httpCli: HttpClient) { 
  }

  setUrl(pokeId: number){
    this.url = this.baseUrl + pokeId;
  }

  capturePokemon(): Observable<string> {
    return this.httpCli.get<string>(this.url);
  }

  capturePokemonReloaded(): Observable<Pokes>{
    return this.httpCli.get<Pokes>(this.url);
  }
}


/**
 * 
 * What is a Data stream?
 *    Streams use a publisher-subscriber design pattern 
 *    A publisher will "publish" data to the stream, THEN any suscribers will be notified that new data has entereed the stream 
 *    Imagine a stream of water, where you puta  paper sail boat upstream (you're publishing data)
 *      and any entities (subscribers) can access the paper sail boat downstream.
 * 
 * What is an Observable?
 *     An observable is used to publish information to a stream. In the publiusher-subscriber design pattern, it acts as a publisher.
 *     After an observable publishes information to the stream, then ALL subscribers will be notified of the new data that has 
 *        entered the stream (the subscribers callback function will then be activated)
 *     We DON'tknow how much data will be published to the stream. It could be 100,000 activation, or it could be 7  or it could be 0.
 * 
 * Observable and a Promise
 *  NOTE: Promises are differnt implementations of ajax - it will have 1 activation. A promise is an entity that will fetch 1 data obejct
 *    for you. You don't know WHEN it will get that object..  bit it promises that it will get it for you.
 * 
 * Promises in the meantime leave you with a placeholder for the future object. 
 * 
 * Promises retrieve a SINGLE data object (usually a JSON)
 * Observable could retrieve 0 or more... we cant' guess how many times a publisher will publish data to the stream. 
 */

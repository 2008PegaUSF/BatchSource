import { Injectable } from '@angular/core';
import { BehaviorSubject } from 'rxjs';

@Injectable({
  providedIn: 'root'
})
export class BehaviouralService {

  private speechBubble = 'my inner thoughts'; //placeholder value 

  set mySpeechBubble(temp: string){
    console.log(`Look I'm inside the setter!: ${temp}`);
    this.speechBubble = temp;
  }

  get mySpeechBubble(){
    console.log(`Look I'm in the getter`)
    return this.speechBubble;
  }
  //-------------------------Above this is using setters and getters-------------------------

  private myBehaviouralSubject = new BehaviorSubject<string>(this.speechBubble); //used to publish 

  private castMyBehaviouralSubjectToObservable =
                              this.myBehaviouralSubject.asObservable(); //used to subscribe

  changeSpeechBubbleUsingBehave(newSpeech: string){
    //This is how you publish new data to your stream
    this.myBehaviouralSubject.next(newSpeech);
  }

  get theObserv(){
    return this.castMyBehaviouralSubjectToObservable;
  }

  constructor() { }
}

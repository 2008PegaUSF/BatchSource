import { Component, OnInit } from '@angular/core';
import { BehaviouralService } from '../service/behavioural.service';

@Component({
  selector: 'app-trigger',
  templateUrl: './trigger.component.html',
  styleUrls: ['./trigger.component.css']
})
export class TriggerComponent implements OnInit {

  myInput: string;
  capturedSpeechBubble : string = '';


  //Trying with setter and getter
  changeSpeechBubbleWithSetter(){
      this.behaveServ.mySpeechBubble = this.myInput; //using setter 
  }

  changeSpeechBubbleWithBehaviour(){
    this.behaveServ.changeSpeechBubbleUsingBehave(this.myInput);
  }

  constructor(private behaveServ: BehaviouralService) { }

  ngOnInit(): void {
    this.capturedSpeechBubble = this.behaveServ.mySpeechBubble; //using getter

    this.behaveServ.theObserv.subscribe(
      (data) => this.capturedSpeechBubble = data
    )

  }

}

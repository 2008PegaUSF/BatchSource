import { Component, OnInit } from '@angular/core';
import { BehaviouralService } from '../service/behavioural.service';

@Component({
  selector: 'app-raeaction',
  template: '<h1> Inside template!!! </h1>',
  styleUrls: ['./raeaction.component.css']
})
export class RaeactionComponent implements OnInit {

  capturedSpeechBubble: string;

  constructor(private behaveServ: BehaviouralService) { }

  ngOnInit(): void {

    this.behaveServ.theObserv.subscribe(
      (data) => 
        this.capturedSpeechBubble = data   )
  }

}

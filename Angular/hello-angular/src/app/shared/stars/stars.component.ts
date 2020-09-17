import { Component, EventEmitter, Input, OnChanges, OnInit, Output, SimpleChanges } from '@angular/core';

@Component({
  selector: 'app-stars',
  templateUrl: './stars.component.html',
  styleUrls: ['./stars.component.css']
})
export class StarsComponent implements OnChanges, OnInit {

  starWidth: number;
  planetName: string;

  /**
   * The line create an attribute directive
   *  Thhis is a way for us to send information from parent to child
   */
  @Input() livibility: number; 

  /**
   * This line creates a custom event to emit ot the parent component. 
   *  This is a way for us to send information from child to parent. 
   */
  @Output() starClicked: EventEmitter<string> = new EventEmitter<string>();

  onStarClick(){
    this.starClicked.emit(`The livibility score is ${this.livibility}. (From inside the star component)`)
  }

  constructor() {

    // this.starWidth = this.livibility * 70/5;
   }
  ngOnInit(): void {
    
  }

  //The method is called a lifecycle hook 
  ngOnChanges(changes: SimpleChanges): void {
    this.starWidth = this.livibility * 70/5;
  }


 

  /**
   * 
   * 
   * The lifecycle of a component in Angular:
   *  1. Create component
   *  2. Render component
   *    3. Create and Render Children (sub component)
   *  4. Apply and updates the components may have - this is the when the ngOnChanges() method is invoked
   *  5. Destroy Component 
   * 
   * Research the full lifecycle of a component.
   *  ngOnInit vs constructor 
   */

}

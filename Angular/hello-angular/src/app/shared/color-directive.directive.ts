import { Directive, ElementRef, HostListener } from '@angular/core';

/**
   * A directive is a maekr on an element which allows a specified behavior to be attacht to that element. 
   * This specified beahviour can inculde, removing that element from the DOM under certain circumnstances. 
   * 
   * There are 2 types : structural and attributie directives. 
   * 
   * Structural directives modify the DOM's strctucure by adding, removing or manipulating elements. 
   * 
   * Structural directives are preceded by asterisks (*). e.g. *ngIf or *ngFor
   * 
   * 
   * An attribuite directive, changes the apperance  or behaviour of a DOM element. 
   * A common example of an attribute directive is ngStyle. 
   * We're going to make our own one. 
   */

@Directive({
  selector: '[appColorDirective]'
})
export class ColorDirectiveDirective {

  constructor(private element: ElementRef) { }

  //A function that I defined, "onMouseEnter", that will trigger when a mouse enters the element
  @HostListener('mouseenter') onMouseEnter(){

      let textStuff: string = this.element.nativeElement.innerText; //Get the element's text value

      textStuff = textStuff.toLowerCase();

      console.log(textStuff);

      if(textStuff == 'planet: earth'){
        this.element.nativeElement.style.color = "ForestGreen";
      } else {
        this.element.nativeElement.style.color = "Crimson";
      }




  }

  

}

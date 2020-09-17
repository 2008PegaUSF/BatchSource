import { Component, OnInit } from '@angular/core';
import { Router } from '@angular/router';

@Component({
  selector: 'app-welcome',
  templateUrl: './welcome.component.html',
  styleUrls: ['./welcome.component.css']
})
export class WelcomeComponent implements OnInit {

  constructor(private routerMod: Router) { }

  ngOnInit(): void {
  }

  pageButtonClicked(){
    console.log('button is clicked')

    this.routerMod.navigate(['/planets']);
  }


}

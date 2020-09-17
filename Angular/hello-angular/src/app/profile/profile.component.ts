import { Component, OnInit } from '@angular/core';
import { ActivatedRoute } from '@angular/router';

@Component({
  selector: 'app-profile',
  templateUrl: './profile.component.html',
  styleUrls: ['./profile.component.css']
})
export class ProfileComponent implements OnInit {

  currentUser = '';

  constructor(private route: ActivatedRoute) { 
//ActivatedRoute is another external service 

  }

  ngOnInit(): void {
    this.currentUser = this.route.snapshot.paramMap.get('myPathVariable');
  }

}

import { Component, OnInit } from '@angular/core';
import { Router } from '@angular/router';

@Component({
  selector: 'app-welcome',
  templateUrl: './welcome.page.html',
  styleUrls: ['./welcome.page.scss'],
})
export class WelcomePage implements OnInit {

  constructor(private routes: Router) { }

  ngOnInit() {
    setTimeout(() => {
      this.routes.navigateByUrl('folder/Inbox')
    }, 10000)
  }

}

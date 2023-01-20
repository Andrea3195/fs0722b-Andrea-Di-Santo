import { Component, OnInit } from '@angular/core';

@Component({
  selector: 'app-registrer',
  templateUrl: './registrer.component.html',
  styleUrls: ['./registrer.component.scss']
})
export class RegistrerComponent implements OnInit {
  signupUsers: any[] = [];
  signupObj: any = {
    userName: '',
    email: '',
    password: '',
  }
  constructor() { }

  ngOnInit(): void {
  }
  onSignUp(){


    this.signupUsers.push(this.signupObj)
    localStorage.setItem('signUpUsers', JSON.stringify(this.signupUsers));
    this.signupObj = {
      userName: '',
      email: '',
      password: '',
    }
  }
}

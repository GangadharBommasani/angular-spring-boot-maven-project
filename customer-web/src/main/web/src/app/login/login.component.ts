import { Component } from '@angular/core';

import { Signup } from '../model/signup.model';

import { LoginService } from '../services/login.service';


@Component({
    selector: 'login',
    templateUrl: './login.component.html',
    styleUrls: ['./login.component.css']
})
export class LoginComponent {

    constructor(private loginService: LoginService) {

    }

    public onClickSubmit(singInValue: Signup): void {
        this.loginService.createUserSignin(singInValue);
    }



}
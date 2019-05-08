import { Component } from '@angular/core';

import { Signup } from '../model/signup.model';

import { SignupService } from '../services/signup.service';


@Component({
    selector: 'sign-up',
    templateUrl: './signup.component.html',
    styleUrls: ['./signup.component.css']
})
export class SignupComponent {

    constructor(private signupService: SignupService) {

    }

    public onClickSubmit(singUpValue: Signup): void {
        this.signupService.createUserSignup(singUpValue);
    }



}
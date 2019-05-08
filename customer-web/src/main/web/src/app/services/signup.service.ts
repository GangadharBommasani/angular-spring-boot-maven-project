import { Injectable } from '@angular/core';
import { HttpClient } from '@angular/common/http'



@Injectable()
export class SignupService {

    constructor(private httpClient: HttpClient) {
    }

    createUserSignup(signup) {
        console.log('singup', signup);
        this.httpClient.post('/signup', signup);
    }

}
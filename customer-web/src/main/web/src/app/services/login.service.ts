import { Injectable } from '@angular/core';
import { HttpClient } from '@angular/common/http'


@Injectable()
export class LoginService {

    constructor(private httpClient: HttpClient) {
    }

    createUserSignin(signin) {
        console.log('in', signin);
        this.httpClient.post('/signin', signin);
    }

}
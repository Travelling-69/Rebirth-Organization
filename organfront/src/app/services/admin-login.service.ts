import { HttpClient } from '@angular/common/http';
import { Injectable } from '@angular/core';
import { Observable } from 'rxjs';
import { AdminLogin } from '../models/admin-login';

@Injectable({
  providedIn: 'root'
})
export class AdminLoginService {
  private serverurl="http://localhost:8080/admin"
  constructor(private http:HttpClient) { }

   login(e:any,p:any):Observable<AdminLogin[]>
   {
    return this.http.get<AdminLogin[]>(this.serverurl+"/login/"+e+"/"+p)
   }
}

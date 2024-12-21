import { HttpClient } from '@angular/common/http';
import { Injectable } from '@angular/core';
import { Observable } from 'rxjs';
import { Feedback } from '../models/feedback';

@Injectable({
  providedIn: 'root'
})
export class FeedbackService {
  private severurl="http://localhost:8080/feedback"
  constructor(private http:HttpClient) { }
  savefeedback(fee:Feedback):Observable<Feedback>
  {
    return this.http.post<Feedback>(this.severurl+"/addfeed",fee)
  }
  submitdata()
  {
    
  }
}
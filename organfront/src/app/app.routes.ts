import { Component } from '@angular/core';
import { Routes } from '@angular/router';
import { HomeComponent } from './home/home.component';
import { DonateComponent } from './donate/donate.component';
import { InfoComponent } from './info/info.component';
import { LoginComponent } from './login/login.component';
import { RegisterComponent } from './register/register.component';
import { FeedbackComponent } from './feedback/feedback.component';
import { AdminLoginComponent } from './admin-login/admin-login.component';
import { ViewFeedbackComponent } from './view-feedback/view-feedback.component';
import { ViewRegistrationsComponent } from './view-registrations/view-registrations.component';
import { EnquiryComponent } from './enquiry/enquiry.component';

export const routes: Routes = [
    {path:'',component:HomeComponent},
    {path:'Donate',component:DonateComponent},
    {path:'Info',component:InfoComponent},
    {path:'Login',component:LoginComponent},
    {path:'Register',component:RegisterComponent},
    {path:'Feedback',component:FeedbackComponent},
    {path:'AdminLogin',component:AdminLoginComponent},
    {path:'ViewFeedback',component:ViewFeedbackComponent},
    {path:'ViewRegistreations',component:ViewRegistrationsComponent},
    {path:'Enquiry',component:EnquiryComponent}

];

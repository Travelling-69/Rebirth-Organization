import { Component } from '@angular/core';
import { Routes } from '@angular/router';
import { HomeComponent } from './home/home.component';
import { InfoComponent } from './info/info.component';
import { LoginComponent } from './login/login.component';
import { RegisterComponent } from './register/register.component';
import { AdminLoginComponent } from './admin-login/admin-login.component';
import { FeedbackComponent } from './feedback/feedback.component';
import { ViewFeedbackComponent } from './view-feedback/view-feedback.component';
import { ViewRegistrationsComponent } from './view-registrations/view-registrations.component';
import { EnquiryComponent } from './enquiry/enquiry.component';
import { AboutusComponent } from './aboutus/aboutus.component';
import { ContactusComponent } from './contactus/contactus.component';
import { ViewEnquiryComponent } from './view-enquiry/view-enquiry.component';
import { ViewDonateComponent } from './view-donate/view-donate.component';

export const routes: Routes = [
    {path:'',component:HomeComponent},
    {path:'donate',component:HomeComponent},
    
    {path:'login',component:LoginComponent},
    {path:'register',component:RegisterComponent},
    {path:'feedback',component:FeedbackComponent},
    {path:'adminlogin',component:AdminLoginComponent},
    {path:'viewfeedback',component:ViewFeedbackComponent},
    {path:'viewRegistreations',component:ViewRegistrationsComponent},
    {path:'enquiry',component:EnquiryComponent},
    {path:'aboutus',component:AboutusComponent},
    {path:'contactus',component:ContactusComponent},
    {path:'viewenquiry',component:ViewEnquiryComponent},
    {path:'viewdonate',component:ViewDonateComponent}

];

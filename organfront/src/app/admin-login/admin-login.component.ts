import { Component } from '@angular/core';
import { AdminLogin } from '../models/admin-login';
import { FormsModule } from '@angular/forms';
import { AdminLoginService } from '../services/admin-login.service';
import { Router } from '@angular/router';

@Component({
  selector: 'app-admin-login',
  imports: [FormsModule],
  templateUrl: './admin-login.component.html',
  styleUrl: './admin-login.component.css'
})
export class AdminLoginComponent {
adm:AdminLogin=new AdminLogin()
constructor(private admserv:AdminLoginService,private router:Router){

}
submitdata(){
  this.admserv.login(this.adm.email,this.adm.password).subscribe(data=>{
    if(data.length>0)
    {
      localStorage.setItem("usertype","admin")
      this.router.navigate(["/"])
    }
  })
}
}

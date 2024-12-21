import { CommonModule } from '@angular/common';
import { Component, OnInit } from '@angular/core';
import { Router, RouterLink } from '@angular/router';

@Component({
  selector: 'app-navbar',
  imports: [RouterLink, CommonModule],
  templateUrl: './navbar.component.html',
  styleUrl: './navbar.component.css'
})
export class NavbarComponent implements OnInit {

  menutype = "Guest"
  constructor(private router: Router) {

  }
  ngOnInit(): void {
    this.router.events.subscribe((val: any) => {
      if (val.url) {
        let ut = localStorage.getItem("usertype")
        if (ut == "user")
          this.menutype = "user"
        else if(ut=="admin")
          this.menutype = "Admin"
        else
        this.menutype="Guest"
      }

    })
  }

logout()
{
  localStorage.removeItem("emailid")
  localStorage.setItem("usertype","guest")
  this.router.navigate(["/"])
}
alogout()
{
  localStorage.setItem("usertype","guest")
  this.router.navigate(["/"])
}
}

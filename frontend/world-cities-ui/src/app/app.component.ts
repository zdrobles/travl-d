import { Component, OnInit } from '@angular/core';
import { OidcSecurityService } from 'angular-auth-oidc-client';

@Component({
  selector: 'app-root',
  templateUrl: './app.component.html',
  styleUrls: ['./app.component.css']
})
export class AppComponent implements OnInit {
  title = 'world-cities-ui';
  
  constructor(private oidcSecurityService: OidcSecurityService) {}
  
  ngOnInit() {
    this.oidcSecurityService.checkAuth().subscribe(({ isAuthenticated: boolean }) => {
      console.log('app is authenticated');
    });
  }
}

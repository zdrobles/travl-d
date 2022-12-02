import { NgModule } from '@angular/core';
import { AuthModule } from 'angular-auth-oidc-client';


@NgModule({
    imports: [AuthModule.forRoot({
        config: {
            authority: 'https://dev-cwm8ptyn6wltv6os.us.auth0.com',
            redirectUrl: window.location.origin,
            clientId: 'w51BVzXyaZmLWjhRuQST9BdalA0iJDS5',
            scope: 'openid profile offline_access',
            responseType: 'code',
            silentRenew: true,
            useRefreshToken: true,
        }
      })],
    exports: [AuthModule],
})
export class AuthConfigModule {}

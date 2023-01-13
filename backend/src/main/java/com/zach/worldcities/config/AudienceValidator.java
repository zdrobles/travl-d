package com.zach.worldcities.config;

import org.springframework.security.oauth2.core.OAuth2Error;
import org.springframework.security.oauth2.core.OAuth2TokenValidator;
import org.springframework.security.oauth2.core.OAuth2TokenValidatorResult;
import org.springframework.security.oauth2.jwt.Jwt;

public class AudienceValidator implements OAuth2TokenValidator<Jwt> {

	private final String audience;
	public AudienceValidator(String audience) {
		this.audience = audience;
	}
	@Override
	public OAuth2TokenValidatorResult validate(Jwt token) {
		return token.getAudience().contains(audience) ? 
				OAuth2TokenValidatorResult.success() : 
					OAuth2TokenValidatorResult.failure(new OAuth2Error("invalid audience for the given token"));
//		if (token.getAudience().contains(audience)) {
//			return OAuth2TokenValidatorResult.success();
//		}
//		return OAuth2TokenValidatorResult.failure(new OAuth2Error("invalid audience for the given token"));
	}

}

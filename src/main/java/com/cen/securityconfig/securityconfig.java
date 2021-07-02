package com.cen.securityconfig;

import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;

@Configuration
public class securityconfig extends WebSecurityConfigurerAdapter{
	
	protected void configure(HttpSecurity httpSecurity) throws Exception{
		httpSecurity.authorizeRequests()
		.anyRequest().authenticated()
		.and().oauth2Login();
		
		
		

		
	}
}

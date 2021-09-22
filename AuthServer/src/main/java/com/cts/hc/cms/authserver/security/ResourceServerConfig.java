package com.cts.hc.cms.authserver.security;

import org.springframework.context.annotation.Configuration;
import org.springframework.http.HttpMethod;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.oauth2.config.annotation.web.configuration.EnableResourceServer;
import org.springframework.security.oauth2.config.annotation.web.configuration.ResourceServerConfigurerAdapter;
import org.springframework.security.oauth2.config.annotation.web.configurers.ResourceServerSecurityConfigurer;

@Configuration
@EnableResourceServer
public class ResourceServerConfig extends ResourceServerConfigurerAdapter{

	private static final String POLICYRESOURCE = "policyresource";
	
	@Override
	public void configure(ResourceServerSecurityConfigurer resources) throws Exception {
			resources.resourceId(POLICYRESOURCE);
	}
	
	@Override
	public void configure(HttpSecurity http) throws Exception {
		http.authorizeRequests().mvcMatchers(HttpMethod.GET , "policy/getChainOfProviders/")
			//	.hasAnyRole("MEMBER").anyRequest()
				.denyAll().and().csrf().disable();
	}
	
}

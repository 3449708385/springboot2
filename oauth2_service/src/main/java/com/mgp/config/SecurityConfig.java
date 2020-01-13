package com.mgp.config;

import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.stereotype.Component;

@Component
public class SecurityConfig extends WebSecurityConfigurerAdapter {

	@Override
	protected void configure(HttpSecurity http) throws Exception {

	/*	http.authorizeRequests().antMatchers("/oauth/**").permitAll()
				.antMatchers("/**").fullyAuthenticated()
				.and().httpBasic().and().csrf().disable();*/

		http.authorizeRequests().antMatchers("/**").fullyAuthenticated().and().httpBasic();
		/**
		 * httpSecurity.
		 requestMatchers()
		 // 必须登录过的用户才可以进行 oauth2 的授权码申请
		 .antMatchers("/", "/home", "/login", "/oauth/authorize")
		 .and()
		 .authorizeRequests()
		 .anyRequest().permitAll()
		 .and()
		 .formLogin()
		 .loginPage("/login")
		 .and()
		 .httpBasic()
		 .disable()
		 .exceptionHandling()
		 .accessDeniedPage("/login?authorization_error=true")
		 .and()
		 .csrf()
		 .requireCsrfProtectionMatcher(new AntPathRequestMatcher("/oauth/authorize"))
		 .disable();
		 */

	}
}

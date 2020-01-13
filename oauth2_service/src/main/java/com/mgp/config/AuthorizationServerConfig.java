package com.mgp.config;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.http.HttpMethod;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.authentication.AuthenticationProvider;
import org.springframework.security.authentication.dao.DaoAuthenticationProvider;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.AuthenticationException;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.security.oauth2.config.annotation.configurers.ClientDetailsServiceConfigurer;
import org.springframework.security.oauth2.config.annotation.web.configuration.AuthorizationServerConfigurerAdapter;
import org.springframework.security.oauth2.config.annotation.web.configuration.EnableAuthorizationServer;
import org.springframework.security.oauth2.config.annotation.web.configurers.AuthorizationServerEndpointsConfigurer;
import org.springframework.security.oauth2.config.annotation.web.configurers.AuthorizationServerSecurityConfigurer;
import org.springframework.security.oauth2.provider.token.TokenStore;
import org.springframework.security.oauth2.provider.token.store.JdbcTokenStore;
import org.springframework.security.provisioning.InMemoryUserDetailsManager;

@Configuration
@EnableAuthorizationServer
public class AuthorizationServerConfig extends AuthorizationServerConfigurerAdapter {

	@Autowired
	private AuthenticationManager authenticationManager;

	@Autowired
	@Qualifier("dataSource")
	private DataSource dataSource;

	// @Autowired
	// private UserDetailsService userDetailsService;

	@Bean
	public TokenStore tokenStore() {
		// return new InMemoryTokenStore();
		return new JdbcTokenStore(dataSource);
	}

	@Override
	public void configure(ClientDetailsServiceConfigurer clients) throws Exception {


		/**code认证：
		 * 1.获取code,浏览器访问http://localhost:8005/oauth/authorize?response_type=code&client_id=client_1&redirect_uri=http://www.mayikt.com，通过user_1,123456登陆
		 * 然后返回code码
		 * 2.获取access_token,浏览器访问http://localhost:8005/oauth/token?grant_type=authorization_code&code=WTzUIs&redirect_uri=http://www.mayikt.com&scope=all，通过client_1,client_1登陆
		 * password认证
		 * 1.post获取access_token:http://localhost:8005/oauth/token?grant_type=password&username=user_1&password=123456&client_id=client_1&client_secret=client_1&scope=all
		 * get检查access_token:http://localhost:8005/oauth/check_token?token=460a6f30-630f-481f-98a9-5036309d8a45
		 * post刷新access_token:http://localhost:8005/oauth/token?grant_type=refresh_token&refresh_token=be0fdc06-84bb-4273-9534-a3a68dde62d5&client_id=client_1&client_secret=client_1
		 */
		clients.jdbc(dataSource);
		/*clients.jdbc(dataSource).withClient("client_1").secret(new BCryptPasswordEncoder().encode("client_1"))
				.authorizedGrantTypes("password", "refresh_token", "authorization_code")
				.redirectUris("http://www.mayikt.com").authorities("ROLE_ADMIN", "ROLE_USER")
				.scopes("all").accessTokenValiditySeconds(7200).refreshTokenValiditySeconds(7200);*/
	}

	@Override
	public void configure(AuthorizationServerEndpointsConfigurer endpoints) throws Exception {
		//允许post和get请求
		endpoints.allowedTokenEndpointRequestMethods(HttpMethod.GET, HttpMethod.POST);
		endpoints.tokenStore(tokenStore()).authenticationManager(authenticationManager)
				.userDetailsService(userDetailsService());
	}

	//真实环境注释掉这里，读取数据库全部数据，注入到userDetailsService，操作重写userDetailsService，根据用户名读取数据库数据，然后注入到endpoints
	@Bean
	UserDetailsService userDetailsService() {
		InMemoryUserDetailsManager userDetailsService = new InMemoryUserDetailsManager();
		userDetailsService.createUser(User.withUsername("user_1").password(new BCryptPasswordEncoder().encode("123456"))
				.authorities("ROLE_USER").build());
		userDetailsService.createUser(User.withUsername("user_2")
				.password(new BCryptPasswordEncoder().encode("1234567")).authorities("ROLE_USER").build());
		return userDetailsService;
	}

	@Override
	public void configure(AuthorizationServerSecurityConfigurer security) throws Exception {
		security.tokenKeyAccess("permitAll()").checkTokenAccess("isAuthenticated()")
				.allowFormAuthenticationForClients();
		//check token 允许
		security.checkTokenAccess("permitAll()");

	}

	@Bean
	AuthenticationManager authenticationManager() {
		AuthenticationManager authenticationManager = new AuthenticationManager() {

			@Override
			public Authentication authenticate(Authentication authentication) throws AuthenticationException {
				return daoAuhthenticationProvider().authenticate(authentication);
			}
		};
		return authenticationManager;
	}

	@Bean
	public AuthenticationProvider daoAuhthenticationProvider() {
		DaoAuthenticationProvider daoAuthenticationProvider = new DaoAuthenticationProvider();
		daoAuthenticationProvider.setUserDetailsService(userDetailsService());
		daoAuthenticationProvider.setHideUserNotFoundExceptions(false);
		daoAuthenticationProvider.setPasswordEncoder(passwordEncoder());
		return daoAuthenticationProvider;
	}

	@Bean
	PasswordEncoder passwordEncoder() {
		PasswordEncoder passwordEncoder = new BCryptPasswordEncoder();
		return passwordEncoder;
	}

}

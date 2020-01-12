package com.mgp.config;
//package com.mayikt.config;
//
//import org.springframework.context.annotation.Bean;
//import org.springframework.context.annotation.Configuration;
//import org.springframework.http.HttpMethod;
//import org.springframework.security.authentication.AuthenticationManager;
//import org.springframework.security.authentication.AuthenticationProvider;
//import org.springframework.security.authentication.dao.DaoAuthenticationProvider;
//import org.springframework.security.core.Authentication;
//import org.springframework.security.core.AuthenticationException;
//import org.springframework.security.core.userdetails.User;
//import org.springframework.security.core.userdetails.UserDetailsService;
//import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
//import org.springframework.security.crypto.password.PasswordEncoder;
//import org.springframework.security.oauth2.config.annotation.configurers.ClientDetailsServiceConfigurer;
//import org.springframework.security.oauth2.config.annotation.web.configuration.AuthorizationServerConfigurerAdapter;
//import org.springframework.security.oauth2.config.annotation.web.configuration.EnableAuthorizationServer;
//import org.springframework.security.oauth2.config.annotation.web.configurers.AuthorizationServerEndpointsConfigurer;
//import org.springframework.security.oauth2.config.annotation.web.configurers.AuthorizationServerSecurityConfigurer;
//import org.springframework.security.provisioning.InMemoryUserDetailsManager;
//
//// ��Ȩ��֤������������
//@Configuration
//@EnableAuthorizationServer
//public class AuthorizationServerConfig extends AuthorizationServerConfigurerAdapter {
//
//	// @EnableAuthorizationServer ���� ��Ȩ��֤��������
//	// accessToken ��Ч�� 2Сʱ
//	private static final int ACCESSTOKENVALIDITYSECONDS = 7200;// ��Сʱ
//	private static final int REFRESHTOKENVALIDITYSECONDS = 7200;// ��Сʱ
//	// ���� appid��appkey ���ص���ַ��token��Ч��
//
//	// ˼�����⣺accessToken ��ô�죿 ʹ��ˢ�����ƻ�ȡ�µ�accessToken ������ǰ10���ӵ���ˢ�����ƽӿڽ���ˢ��
//	@Override
//	public void configure(ClientDetailsServiceConfigurer clients) throws Exception {
//
//		// ˼���� �������������Ҫ��oauth2��֤�Ļ� ��һ����������ʲô��
//		// 1.�����ȡ��appid �� appkey д����
//		// clients.inMemory().withClient("client_1").secret(passwordEncoder().encode("123456"))
//		// .redirectUris("http://www.mayikt.com")
//		// .authorizedGrantTypes("authorization_code", "password",
//		// "refresh_token").scopes("all")
//		// .accessTokenValiditySeconds(ACCESSTOKENVALIDITYSECONDS)
//		// .refreshTokenValiditySeconds(REFRESHTOKENVALIDITYSECONDS);// ��Ȩ����
//		// Ϊ��Ȩ������
//		// ������Ȩģʽ ʹ���û����ƺ�������л�ȡaccessToken
//		// ���clientid appid ͬʱʹ������ģʽ����Ȩcode ��ȡaccessToken Ϊ����ʲô����
//		// a ��ͬ
//		// b ����
//		// c ��һ����
//		// d ����
//		// ����ģʽ 660fa8e0-f8db-422d-8891-906db021ded8
//		// ��Ȩģʽ 660fa8e0-f8db-422d-8891-906db021ded8
//		// accessToken ��appid����
//
//	}
//
//	// ����token����
//	public void configure(AuthorizationServerEndpointsConfigurer endpoints) {
//		endpoints.authenticationManager(authenticationManager()).allowedTokenEndpointRequestMethods(HttpMethod.GET,
//				HttpMethod.POST);
//		// �������������Ȼˢ�����ƽӿڻᱨ��
//		endpoints.authenticationManager(authenticationManager());
//		endpoints.userDetailsService(userDetailsService());
//		// ֮ǰ��accessToken b55c980c-31f7-4498-a783-bd905608fb18
//		// ˢ��֮��accessToken d40f7915-dd06-4503-83c8-2815915c9368
//	}
//
//	@Override
//	public void configure(AuthorizationServerSecurityConfigurer oauthServer) {
//		// �������֤
//		oauthServer.allowFormAuthenticationForClients();
//		// ����check_token����
//		oauthServer.checkTokenAccess("permitAll()");
//	}
//
//	@Bean
//	AuthenticationManager authenticationManager() {
//		AuthenticationManager authenticationManager = new AuthenticationManager() {
//
//			public Authentication authenticate(Authentication authentication) throws AuthenticationException {
//				return daoAuhthenticationProvider().authenticate(authentication);
//			}
//		};
//		return authenticationManager;
//	}
//
//	@Bean
//	public AuthenticationProvider daoAuhthenticationProvider() {
//		DaoAuthenticationProvider daoAuthenticationProvider = new DaoAuthenticationProvider();
//		daoAuthenticationProvider.setUserDetailsService(userDetailsService());
//		daoAuthenticationProvider.setHideUserNotFoundExceptions(false);
//		daoAuthenticationProvider.setPasswordEncoder(passwordEncoder());
//		return daoAuthenticationProvider;
//	}
//
//	// ��������û���Ϣ,����Ӧ�ô����ݿ��ж�ȡ
//	@Bean
//	UserDetailsService userDetailsService() {
//		InMemoryUserDetailsManager userDetailsService = new InMemoryUserDetailsManager();
//		userDetailsService.createUser(User.withUsername("user_1").password(passwordEncoder().encode("123456"))
//				.authorities("ROLE_USER").build());
//		userDetailsService.createUser(User.withUsername("user_2").password(passwordEncoder().encode("1234567"))
//				.authorities("ROLE_USER").build());
//		return userDetailsService;
//	}
//
//	@Bean
//	PasswordEncoder passwordEncoder() {
//		// ���ܷ�ʽ
//		PasswordEncoder passwordEncoder = new BCryptPasswordEncoder();
//		return passwordEncoder;
//	}
//
//}

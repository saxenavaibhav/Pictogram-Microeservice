package com.saxena.vaibhav.pictogram.user.security;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.env.Environment;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;

import com.saxena.vaibhav.pictogram.user.service.UserService;

@Configuration
@EnableWebSecurity
public class WebSecurity extends WebSecurityConfigurerAdapter{

	private Environment environment;
	
	private UserService usersService;
	
	private BCryptPasswordEncoder bCryptPasswordEncoder;
	
	@Autowired	
	public WebSecurity(Environment environment, UserService usersService, BCryptPasswordEncoder bCryptPasswordEncoder) {
		super();
		this.environment = environment;
		this.usersService = usersService;
		this.bCryptPasswordEncoder = bCryptPasswordEncoder;
	}

	protected void configure(HttpSecurity http) throws Exception {
		http.
			csrf().
			disable();
		
		http.headers().frameOptions().disable(); // Need this for h2 to work.
		
		http.
			authorizeRequests().
			antMatchers("/**").permitAll().// hasIpAddress(environment.getProperty("gateway.ip")).
			and().addFilter(getAuthenticationFilter());
			
	}
	
	private AuthenticationFilter getAuthenticationFilter() throws Exception {
		AuthenticationFilter filter = new AuthenticationFilter(usersService, environment, authenticationManager());
		filter.setFilterProcessesUrl(environment.getProperty("login.url.path"));
		return filter;
	}
	
	@Override
    protected void configure(AuthenticationManagerBuilder auth) throws Exception {
        auth.userDetailsService(usersService).passwordEncoder(bCryptPasswordEncoder);
    }
}

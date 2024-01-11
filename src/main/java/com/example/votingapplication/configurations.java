package com.example.votingapplication;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.web.SecurityFilterChain;

@Configuration
public class configurations {
	@Bean
	public SecurityFilterChain filterChain(HttpSecurity http) throws Exception {
	   http.csrf().disable().requestCache().disable()
	   .headers().frameOptions().disable()
	   .and()
	   .authorizeHttpRequests()
	   .requestMatchers("/update" , "/delete").authenticated()
	   .anyRequest().permitAll()
	   
	   .and().formLogin()
	   .and().httpBasic();
	   
	   return http.build();
	}
}

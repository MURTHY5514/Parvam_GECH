package com.springSecurityDemo.springSecurityDemo.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.authentication.dao.DaoAuthenticationProvider;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;

import com.springSecurityDemo.springSecurityDemo.repository.StudentRepo;
import com.springSecurityDemo.springSecurityDemo.service.CustomUserDetailsService;

@Configuration
public class SecurityConfig {
	
	private StudentRepo studentRepo;
	

	public SecurityConfig(StudentRepo studentRepo) {
		super();
		this.studentRepo = studentRepo;
	}

	@Bean
	public PasswordEncoder passwordEncoder() {
		return new BCryptPasswordEncoder();
	}
	
	@Bean
	public UserDetailsService userDetailsService() {
		return new CustomUserDetailsService(studentRepo);
	}
	
	@Bean
	public DaoAuthenticationProvider doAuthenticationProvider() {
		DaoAuthenticationProvider provider = new DaoAuthenticationProvider();
		provider.setPasswordEncoder(passwordEncoder());
		provider.setUserDetailsService(userDetailsService());
		return provider;
	}
}

package com.springbootfirstapp;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class SpringBootConfigClass {
	
	@Bean("customer1")
	public Customer customer() {
		Customer c1 = new Customer();
		c1.name = "mohan";
		c1.age = 23;
//		return new Customer();
		return c1;
	}
	
	@Bean("customer2")
	public Customer customer2() {
		Customer c1 = new Customer();
		return c1;
	}
	
	@Bean // if you don't provide bean name then method name taken as bean name.
	public Customer customer3() {
		Customer c1 = new Customer();
		return c1;
	}
	
}

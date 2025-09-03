package com.springbootdependency;

import org.springframework.stereotype.Component;

@Component
public class Address {
	private String name;
	
	public Address() {
		System.out.println("Address object created");
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
}

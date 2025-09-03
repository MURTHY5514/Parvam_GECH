package com.springbootdependency;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class Employee {
	private String name;

	private Address addressOne;

	public Employee() {
		System.out.println("Employee object created");
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Address getAddressOne() {
		return addressOne;
	}
	
	@Autowired
	@Qualifier("address2")
	public void setAddressOne(Address addressOne) {
		this.addressOne = addressOne;
	}
	
	
}

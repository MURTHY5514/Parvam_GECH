package com.springbootfirstapp;

import org.springframework.stereotype.Component;

@Component("car1") // if you don't provide the name then class name is taken as bean name.
public class Car {
	String name;
	String model;
	int no_w;
	
	public Car() {
		System.out.println("Car object created");
	}
}

package com.springbootfirstapp.hello;

import org.springframework.stereotype.Component;

@Component
public class Student {
	String name;
	
	public Student() {
		System.out.println("Student object created");
	}
}

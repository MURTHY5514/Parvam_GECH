package com.springbootvalue;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class SpringBootValueApplication {

	public static void main(String[] args) {
		ConfigurableApplicationContext run = SpringApplication.run(SpringBootValueApplication.class, args);
		Student st = run.getBean(Student.class);
		System.out.println("Name: "+st.getName());
		System.out.println("Age: "+st.getAge());
		System.out.println("Email: "+st.getEmail());
		System.out.println("Address: "+ st.getAddress().getState()+" - "+st.getAddress().getPincode());
		System.out.println("Skills: "+st.getSkills());
	}

}

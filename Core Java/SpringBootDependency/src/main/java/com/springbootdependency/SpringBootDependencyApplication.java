package com.springbootdependency;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class SpringBootDependencyApplication {

	public static void main(String[] args) {
		ConfigurableApplicationContext run = SpringApplication.run(SpringBootDependencyApplication.class, args);
		 Employee emp = (Employee)run.getBean("employee");
		 System.out.println("Employee: "+emp);
		 System.out.println("From employee: "+emp.addressOne);
		 
		 //first
		 Address address = (Address)run.getBean("address");
		 System.out.println("First Address"+address);
		 Address address1 = (Address)run.getBean("address1");
		 System.out.println("Sec Address"+address1);
		 Address address2 = (Address)run.getBean("address2");
		 System.out.println("Thir Address"+address2);
		 
	}

}

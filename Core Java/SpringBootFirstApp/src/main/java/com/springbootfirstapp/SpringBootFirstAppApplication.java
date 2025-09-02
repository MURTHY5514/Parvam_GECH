package com.springbootfirstapp;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class SpringBootFirstAppApplication {

	public static void main(String[] args) {
		ConfigurableApplicationContext run = SpringApplication.run(SpringBootFirstAppApplication.class, args);
		Object bean = run.getBean("customer1");
		Customer c1 = (Customer) bean;
		System.out.println(c1);
		System.out.println(c1.name);
		
		
		Customer customer2 = (Customer)run.getBean("customer2");
		System.out.println(customer2);
		
		
		Customer customer3 = (Customer)run.getBean("customer3");
		System.out.println(customer3);
		
//		Customer bean2 = run.getBean(Customer.class); // if ioc contains only one bean per perticular class.
//		System.out.println(bean2);
		
		
		Car car = (Car)run.getBean("car1");
		System.out.println(car.name);
		System.out.println(car.no_w);
	}

}

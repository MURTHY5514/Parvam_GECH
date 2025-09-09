package com.springbootdatajpa;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class SpringBootDataJpa1Application {

	public static void main(String[] args) {
		ConfigurableApplicationContext run = SpringApplication.run(SpringBootDataJpa1Application.class, args);
		SpringData bean = run.getBean(SpringData.class);
//		bean.addStudent();
//		bean.getStudent();
		bean.getStudentByEmail();
	}

}

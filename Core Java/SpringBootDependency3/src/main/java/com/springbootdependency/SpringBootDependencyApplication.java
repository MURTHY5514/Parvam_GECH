package com.springbootdependency;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class SpringBootDependencyApplication {

	public static void main(String[] args) {
		ConfigurableApplicationContext run = SpringApplication.run(SpringBootDependencyApplication.class, args);		 
		SpringBootInterfcae bean = run.getBean(SpringBootInterfcae.class);
		bean.getPaymentService().paymentType();
		NetBankingPaymentService bean2 = run.getBean(NetBankingPaymentService.class);
		bean2.paymentType();
	}

}

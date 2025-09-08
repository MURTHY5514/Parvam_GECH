package com.springbootdependency;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class SpringBootInterfcae {
//	@Qualifier("creditPaymentService")
	@Autowired
	private PaymentService paymentService;
	
	public SpringBootInterfcae() {
		super();
		System.out.println("SpringBootInterfcae object created");
	}

	public PaymentService getPaymentService() {
		return paymentService;
	}

	public void setPaymentService(PaymentService paymentService) {
		this.paymentService = paymentService;
	}
}

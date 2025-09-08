package com.springbootdependency;

import org.springframework.stereotype.Component;

@Component
public class NetBankingPaymentService implements PaymentService {
	
	NetBankingPaymentService(){
		System.out.println("NetBankingPaymentService object created");
	}
	
	@Override
	public void paymentType() {
		System.out.println("Netbanking Payment type");
	}

}

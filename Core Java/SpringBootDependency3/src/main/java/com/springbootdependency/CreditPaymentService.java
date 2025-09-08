package com.springbootdependency;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Primary
@Component
public class CreditPaymentService implements PaymentService {

	@Override
	public void paymentType() {
		System.out.println("Credit payment type");
	}

}

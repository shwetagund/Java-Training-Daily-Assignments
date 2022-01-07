package com.example.demo.services;

import java.util.UUID;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.entity.Payment;
import com.example.demo.repository.PaymentRepository;

@Service
public class PaymentServices {
	@Autowired
	  private PaymentRepository paymentRepo;
	
	public Payment doPayment(Payment payment){
		payment.setTransctionId(UUID.randomUUID().toString());
		  return paymentRepo.save(payment);
		  }

	
}

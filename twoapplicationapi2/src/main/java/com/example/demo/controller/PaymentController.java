package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


import com.example.demo.entity.Payment;
import com.example.demo.services.PaymentServices;

@RestController
@RequestMapping("/payment")
public class PaymentController {
	@Autowired
	private PaymentServices paymentserv;
	
	@PostMapping("/payments")
	public Payment createCall(@RequestBody Payment payment) {
		return paymentserv.doPayment(payment) ;
	}
	

}

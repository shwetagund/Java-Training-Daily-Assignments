package com.allopertioninspringboot.alldatabaseoperation.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.allopertioninspringboot.alldatabaseoperation.entity.Customers;
import com.allopertioninspringboot.alldatabaseoperation.repository.CustomersRepo;

@RestController
@RequestMapping("/cutomer")
public class CustomerController {
    @Autowired
    private CustomersRepo customerrepo ;
    
    @PostMapping("/create")
	public Customers addCustomer(@RequestBody Customers customer) {
		return  customerrepo.save(customer);
	}

}

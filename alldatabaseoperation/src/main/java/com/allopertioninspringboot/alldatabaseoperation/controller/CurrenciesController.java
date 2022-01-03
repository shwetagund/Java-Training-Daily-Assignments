package com.allopertioninspringboot.alldatabaseoperation.controller;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.allopertioninspringboot.alldatabaseoperation.entity.Currencies;
import com.allopertioninspringboot.alldatabaseoperation.repository.CurrenciesRepo;

@RestController
@RequestMapping("/currency")
public class CurrenciesController {
	@Autowired
	private CurrenciesRepo currenciesrepo;

	@PostMapping("/create")
	public Currencies addCurrencie(@RequestBody Currencies currency) {
		return currenciesrepo.save(currency);
	}

}

package com.allopertioninspringboot.alldatabaseoperation.controller;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.allopertioninspringboot.alldatabaseoperation.entity.CountriesCurrencies;
import com.allopertioninspringboot.alldatabaseoperation.repository.CountriesCurrenciesRepo;

@RestController
@RequestMapping("/countrycurr")

public class CountriesCurrenciesController {
	@Autowired
	private CountriesCurrenciesRepo countriescurrenciesrepo;

	@PostMapping("/create")
	public CountriesCurrencies addCountryCurr(@RequestBody CountriesCurrencies countrycurr) {
		return countriescurrenciesrepo.save(countrycurr);
	}
}

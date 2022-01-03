package com.allopertioninspringboot.alldatabaseoperation.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.allopertioninspringboot.alldatabaseoperation.entity.Countires;

import com.allopertioninspringboot.alldatabaseoperation.repository.CountriesRepo;

@RestController
@RequestMapping("/country")
public class CountriesController {
	@Autowired
	private CountriesRepo countriesepo;
	
	@PostMapping("/create")
	public Countires addCountry(@RequestBody Countires country) {
		return countriesepo.save(country);
	}

}

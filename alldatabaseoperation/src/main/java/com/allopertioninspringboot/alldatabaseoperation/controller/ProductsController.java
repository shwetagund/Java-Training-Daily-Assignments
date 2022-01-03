package com.allopertioninspringboot.alldatabaseoperation.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.allopertioninspringboot.alldatabaseoperation.repository.ProductRepo;

@RestController
@RequestMapping("")
public class ProductsController {
	@Autowired
	private ProductRepo productrepo;

}

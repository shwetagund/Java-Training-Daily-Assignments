package com.Springboot.demospringboot;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Democlass {
	@GetMapping("/")
	public String greeting() {
		return "hi welcome";
	}
}

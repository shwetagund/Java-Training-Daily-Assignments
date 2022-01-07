package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.context.config.annotation.RefreshScope;

@SpringBootApplication
@RefreshScope
public class ConfigurationClientApplication {

	public static void main(String[] args) {
		SpringApplication.run(ConfigurationClientApplication.class, args);
	}

}

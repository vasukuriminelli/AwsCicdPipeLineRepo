package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class AwsCicdPipeLineApplication {

	public static void main(String[] args) {
		SpringApplication.run(AwsCicdPipeLineApplication.class, args);
	}

	
	@GetMapping("/getData")
	public String getData() {
		
		return "Welcome To SpringBootWith Cicd PipeLine In Aws ";
	}
}

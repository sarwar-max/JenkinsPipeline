package com;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class SpringBookAppApplication {
	
	@GetMapping
	public String getMessage() {
		return "Hello Sarwar!!!!";
	}

	public static void main(String[] args) {
		SpringApplication.run(SpringBookAppApplication.class, args);
		
		System.out.println("This Application is running on port: 9090");
	}

}

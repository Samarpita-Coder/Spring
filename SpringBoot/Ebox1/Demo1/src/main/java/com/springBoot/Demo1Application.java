package com.springBoot;

import org.springframework.beans.factory.annotation.Value;
//simple hello world project
//to run- type url in browser (http://localhost:portnum/hello)
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@SpringBootApplication
public class Demo1Application {
	
	@Value("${name}")
	private String name;
	public static void main(String[] args) {
		SpringApplication.run(Demo1Application.class, args);
		
		
	}
	
	@GetMapping("/hello")
	public String sayHello() {
		return "Welcome to STS "+name;
	}

}
package com.springboot;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RestController;

import com.springboot.controller.WelcomeController;

@SpringBootApplication
public class Ebox1Application {

    public static void main(String[] args) {

		SpringApplication.run(Ebox1Application.class, args);

	}

}

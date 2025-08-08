package com.example.nbdemo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@SpringBootApplication
public class NbdemoApplication {

	@GetMapping("/hello")
	public String sayHello() {
		return "Hi from cdemo - v3";
	}

	public static void main(String[] args) {
		SpringApplication.run(NbdemoApplication.class, args);
	}

}

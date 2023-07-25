package com.institute.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class WelcomeController {

	// http://localhost:8080/welcome-rest
	@GetMapping("/welcome-rest")
	public String welcomeMeg() {
		return "Hello, Welcome to first REST API in SpringBoot";
	}
	
	// http://localhost:8080/say-hello
	@GetMapping("/say-hello")
	public String sayHello() {
		return "Say Hello to User";
	}
	
}

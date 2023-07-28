package com.institute.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.institute.dto.UserInfo;

@RestController
public class UserController {

	// Accept data from request in the form of parameter
	// http://localhost:8080/user-data-1?fname=Abc&mname=Pqr&lname=Xyz
	@GetMapping("/user-data-1")
	public String userDetails1(@RequestParam("fname") String fn, @RequestParam("mname") String mn, @RequestParam("lname") String ln) {
		String fullName = fn + " " + mn + " " + ln;
		return "Hello, " + fullName;
	}
	
	// Accept data from request in the form of path variable
	// http://localhost:8080/user-data-2/Abc/Pqr/Xyz
	@GetMapping("/user-data-2/{fname}/{mname}/{lname}")
	public String userDetails2(@PathVariable(name = "fname") String fn, @PathVariable(name = "mname") String mn, 
			@PathVariable(name = "lname") String ln) {
		String fullName = fn + " " + mn + " " + ln;
		return "Hello, " + fullName;
	}
	
	
	// Accept User data using JSON, Data Contains name, email, contact
	/*
	 	{
	 		"name": "Abc",
	 		"email": "abc@gmail.com",
	 		"contact": "9988776677"
	 	}
	 */
	@GetMapping("/user-data-3")
	public String UserDetails3(@RequestBody UserInfo info) {
		System.out.println("Name : " + info.getName());
		System.out.println("Email : " + info.getEmail());
		System.out.println("Contact : " + info.getContact());
		return "Hi, User "+info.getName();
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}


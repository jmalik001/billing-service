package com.dj.billingapp.controller;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RequestMapping("/api")
@RestController
public class UserController {

	
	@GetMapping("/users")
	public String users() {
		return "Hello user List:  ";
		
	}

}

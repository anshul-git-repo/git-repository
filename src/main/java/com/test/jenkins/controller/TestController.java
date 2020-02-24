package com.test.jenkins.controller;

import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController {
	
	public String sayHello() {
		
		System.out.println("Hello");
		return "Hello";
		
	}
}

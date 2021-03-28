package com.example.myfirstwebservice.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.example.myfirstwebservice.service.GreetingService;

@RestController
@RequestMapping("/api")


public class GreetingRest {
	@Autowired
	GreetingService service;
	
	@Value("${custom.config.key}")
	float key;

	
	@GetMapping("/greet")
	public String greetByPassingParam(@RequestParam int j, @RequestParam int e, @RequestParam int s, @RequestParam int t) {		
		return service.viewGreeting((j + e + s + t)*key);
	}
	

}
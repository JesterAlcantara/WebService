package com.example.myfirstwebservice.service;

import org.springframework.stereotype.Service;

@Service

public class GreetingService {

	public String viewGreeting(double d) {
		return "The Answer is: " + d;
	}
}

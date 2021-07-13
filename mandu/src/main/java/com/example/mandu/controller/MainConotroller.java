package com.example.mandu.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MainConotroller {

	@GetMapping("/api/hello")
	public String getMessage() {
		return "Hello String boot + react configuration";
	}
}

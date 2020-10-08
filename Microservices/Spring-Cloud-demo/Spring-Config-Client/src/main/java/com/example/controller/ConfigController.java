package com.example.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ConfigController {

	@Value("${message}")
	private String configMessage;
	
	@GetMapping("/test")
	public String ourConfigExample() {
		return configMessage;
	}
}

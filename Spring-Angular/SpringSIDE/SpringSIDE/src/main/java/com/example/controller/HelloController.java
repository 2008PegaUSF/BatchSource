package com.example.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class HelloController {
	
	@GetMapping(value = "hello")
	public @ResponseBody String hello() {
		return "greetings";
	}

}

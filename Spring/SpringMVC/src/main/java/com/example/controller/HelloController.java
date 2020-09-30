package com.example.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping(value = "/hello")
@CrossOrigin( origins = "*") // Dealing with CORS issues 
public class HelloController {
	
	@RequestMapping(value = "/greetings")
	public @ResponseBody String sayHello() {
		return "Hi there";
	}

}

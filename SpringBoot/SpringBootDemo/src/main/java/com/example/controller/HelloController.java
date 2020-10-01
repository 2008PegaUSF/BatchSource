package com.example.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller("ourController")
public class HelloController {
	
	@GetMapping("/ello")
	public @ResponseBody String hello() {
		return "ello There!";
	}

}

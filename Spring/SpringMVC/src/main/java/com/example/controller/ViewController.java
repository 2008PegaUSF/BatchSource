package com.example.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller //Don't need a name for our controller
public class ViewController {
	
	@GetMapping(value = "/nextPage")
	public String nextPage() {
		
		//FORWARD
//		return "/other.html";
		
		//REDIRECT
//		return "redirect: /SpringMVC/other.html";
		return "redirect: https://www.google.com/";
	}

}

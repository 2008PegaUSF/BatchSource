package com.example.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class SessionController {
	
	@GetMapping(value = "/login")
	public @ResponseBody String login(HttpServletRequest request) {
		HttpSession session = request.getSession();
		
		/*
		 * learn how to send information via forms, params and json, so that the user can set the value rather hard code it in. 
		 */
		session.setAttribute("loggedInUser", "Bobby McBobby");
		
		return "Hola";
	}
	
	
	@PostMapping(value = "/getName")
	public @ResponseBody String getLoggedInName(HttpSession session) {
		
		String name = null;
		
		name = (String) session.getAttribute("loggedInUser");
		
		System.out.println("I'm getting my name");
		
		return name;
	}
	
	/*
	 * give an endpoint to logout  (i.e. invalidate the session)
	 */

}

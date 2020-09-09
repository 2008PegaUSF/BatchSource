package com.revature.controller;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class RequestHelper {
	
	/*
	 * RequstHelper acts as a table of contents, it will specify what classes and methods are invoked depending on what request URL we use. 
	 */

	public static void myVeryOwnProcessMethod(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException {
		
		System.out.println("Inside Request Helper");
		
		System.out.println(request.getRequestURI());
		
		String s = request.getRequestURI();
		
		
		
		switch(s) {
		
		//In this case, the endpoint "login" will invoke the login method inside of AuthenticateController
		case "/HelloFrontController/api/login":
			AuthenticateController.login(request,response);
			break;
			
		//In this case, the endpoint "logout" will invoke the logout method inside of AuthenticateController
		case "/HelloFrontController/api/logout":
			AuthenticateController.logout(request,response);
			break;
			
		//In this case, the endpoint "home" will invoke the home method inside of HomeController, giving us the homepage. 
		case "/HelloFrontController/api/home":
			HomeController.getHomePage(request,response);
			break;
			
		default:
			HomeController.getLoginPage(request, response);
		}
		
		
			
	}

}

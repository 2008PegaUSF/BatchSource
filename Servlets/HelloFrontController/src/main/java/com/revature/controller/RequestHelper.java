package com.revature.controller;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class RequestHelper {

	public static void myVeryOwnProcessMethod(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException {
		
		System.out.println("Inside Request Helper");
		
		System.out.println(request.getRequestURI());
		
		String s = request.getRequestURI();
		
		switch(s) {
		
		case "/HelloFrontController/api/login":
			AuthenticateController.login(request,response);
			break;
		
		case "/HelloFrontController/api/logout":
			AuthenticateController.logout(request,response);
			break;
			
		case "/HelloFrontController/api/home":
			HomeController.getHomePage(request,response);
		}
	}

}

package com.revature.controller;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class AuthenticateController {
	
	/*
	 * AuthenticateController will handle all out authentication methods, login and logout as of yet. 
	 * 
	 */

	//Login method will accept user values from a form, using the .getParameter(*key*), after which it will forward or redirect to the "home" endpoint
	public static void login(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException {
		System.out.println("I'm loggin in");
		
		System.out.println(request.getParameter("username"));
		
		String s = request.getParameter("username");
		
//		response.sendRedirect("http://localhost:8080/HelloFrontController/api/home"); //redirects
		
		
		RequestDispatcher rd = request.getRequestDispatcher("/api/home");
		rd.forward(request, response); //forwards 
		
	}
	
	//Logout method has not been implemented. 
	public static void logout(HttpServletRequest request, HttpServletResponse response) {
		System.out.println("I'm loggin out");
		
	}

}

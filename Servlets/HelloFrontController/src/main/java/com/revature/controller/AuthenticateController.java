package com.revature.controller;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class AuthenticateController {

	public static void login(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException {
		System.out.println("I'm loggin in");
		
		System.out.println(request.getParameter("username"));
		
		String s = request.getParameter("username");
		
//		response.sendRedirect("http://localhost:8080/HelloFrontController/api/home");
		
		
		RequestDispatcher rd = request.getRequestDispatcher("/api/home");
		rd.forward(request, response);
		
	}

	public static void logout(HttpServletRequest request, HttpServletResponse response) {
		System.out.println("I'm loggin out");
		
	}

}

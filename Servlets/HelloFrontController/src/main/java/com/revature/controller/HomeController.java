package com.revature.controller;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class HomeController {

	public static void getHomePage(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
//		System.out.println("Welcome Home");
		
		RequestDispatcher rd = request.getRequestDispatcher("/HomePage.html");
		
		rd.forward(request, response);
		
//		response.sendRedirect("http://localhost:8080/HelloFrontController/HomePage.html");
		
	}

}

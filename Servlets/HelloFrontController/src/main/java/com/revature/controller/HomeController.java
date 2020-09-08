package com.revature.controller;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class HomeController {

	/*
	 * HomeController is a simple class, all it does is forward out home page. 
	 * By forwarding the resource (the html page) we hide the resource path.
	 */
	
	public static void getHomePage(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		//To forward, we need use the request dispather
		RequestDispatcher rd = request.getRequestDispatcher("/HomePage.html"); //What is the request dispather? What does it do?
		
		rd.forward(request, response); //We invoke the forward() method inside of request dispatcher. 
		
		
		
//		response.sendRedirect("http://localhost:8080/HelloFrontController/HomePage.html");
		
	}

}

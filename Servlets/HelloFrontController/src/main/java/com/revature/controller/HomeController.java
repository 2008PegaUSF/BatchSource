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

		/*
		 * dao.deleteObject ? 
		 */
		
		if(request.getSession(false) == null ) {
			response.setStatus(476); //476--you really screwed up
			response.sendRedirect("https://www.fbi.gov/");
		} else {
			
			//To forward, we need use the request dispather
			RequestDispatcher rd = request.getRequestDispatcher("/HomePage.html"); //What is the request dispather? What does it do?
			
			rd.forward(request, response); //We invoke the forward() method inside of request dispatcher. 
			
		}
		
		
		
		
		
	}
	
	public static void getLoginPage(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		RequestDispatcher rd = request.getRequestDispatcher("/MyVerySpecialLoginPage.html"); //What is the request dispather? What does it do?
		
		rd.forward(request, response);
	}

	public static void createPlanet() {
		
	}
	
	//We could invoke other endpoints inside of Java, this method might invoke python code by sending a request to a Python server
	public static void recommendProdcutToUser() {
//		invoke Python in here
//		Python will tell me that I should recommend an orange
		
//		return orange;
	}
	
	public static void deleteAllPlanets() {
		
//		Presentation layer (Html, css, Javasscript)
//		||
//		Servlet Layer (Master Servlet)
//		||
//		(Request Helper)
//		Controller Layer (Service Layer, Business logic, this is just JAva)
//		||
//		DAO layer(CRUD methods to our database, JDBC )
//		||
//		Database layer(Oracle, Postgres, MySQL)
	}

}

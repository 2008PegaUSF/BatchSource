package com.revature.servlets;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class SecretServlet
 */
public class SecretServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
   
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
//		Cookie[] listOfCookies = request.getCookies();
//		
//		for(Cookie c: listOfCookies) {
//			System.out.println(c.getName());
//			System.out.println(c.getValue());
//		}
		
		/*
		 * request.getSession() : Wiill return a session or create a new session
		 * 
		 * request.getSession(false) : Will return a session or return null
		 */
		
		if(request.getSession(false) == null) {
			System.out.println("Get a session!");
		} else {
			System.out.println(" Welcome " + request.getSession(false).getAttribute("user"));
		}
		
	}


	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		/*
		 * Logout method
		 */
		request.getSession().invalidate();
	}

}

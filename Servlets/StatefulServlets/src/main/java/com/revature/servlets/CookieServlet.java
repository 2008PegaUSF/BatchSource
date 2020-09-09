package com.revature.servlets;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


public class CookieServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
 
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		
		doPost(request,response);
	}


	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		/*
		 * A way to save information
		 * 
		 * A cookie is a form of metadata about the client.
		 * 
		 */
		
		
		Cookie c = new Cookie("key","value");
		
		Cookie anotherC = new Cookie("user","Billy");
		Cookie passC = new Cookie("password","superSecurePassword");
		
		
		response.addCookie(passC);
		response.addCookie(anotherC);
		
		c.setMaxAge(5);
		anotherC.setMaxAge(5);
		
		
//		request.getRequestDispatcher("/SecretServlet").forward(request, response);
		
		response.sendRedirect("http://localhost:8080/StatefulServlets/SecretServlet");
		
		
		
		
		
		
	}

}

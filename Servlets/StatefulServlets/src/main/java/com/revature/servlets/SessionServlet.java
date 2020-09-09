package com.revature.servlets;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.revature.models.Planet;


public class SessionServlet extends HttpServlet {
       
 
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		/*
		 * login method
		 */
		HttpSession session = request.getSession(); //Will retrieve a session or create a new one
		
		Planet p = new Planet(2,"Venus");
		
		session.setAttribute("user", "steve");
		session.setAttribute("planet", p);
		/*
		 * navigate to home page
		 */
		response.sendRedirect("http://localhost:8080/StatefulServlets/SecretServlet");
	}

}

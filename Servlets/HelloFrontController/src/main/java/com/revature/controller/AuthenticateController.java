package com.revature.controller;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.revature.models.Planet;

public class AuthenticateController {
	
	/*
	 * AuthenticateController will handle all out authentication methods, login and logout as of yet. 
	 * 
	 */

	//Login method will accept user values from a form, using the .getParameter(*key*), after which it will forward or redirect to the "home" endpoint
	public static void login(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException {
	
		/*
		 * What are we validating?
		 * 		The request we're getting is of POST method
		 * 		The "username" is equal to "Bob"
		 * 
		 * Once everything is validated:
		 * 		We create a session
		 * 		Associate a "Planet" with the session
		 */
		
		if(!request.getMethod().equals("POST")) {
			//method guarding 
			response.setStatus(403);
			response.sendRedirect("http://localhost:8080/HelloFrontController/api/");
			
		} else {
		
		
		if(request.getParameter("username").equals("Bob")) {
			
			/*Rather than creating an object, we could check whether the object exists in the dao. 
			 * But I'll leave that to you all to implement. Here some psuedo code instead:
			 * 
			 * 
			 * dao.selectUserByName(requiest.getParameter(user)) != null
			 * "USER DOES NOT EXIST"
			 * 
			 * else
			 * Session.setAttribute("user", dao.selectUserByName(user));
			 * 
			 */
			
			String s = request.getParameter("username");
			
			HttpSession session = request.getSession();
			
			//Planet p = dao.selectPlanetByName(s);
			
			session.setAttribute("user", new Planet(s));
			
			
			RequestDispatcher rd = request.getRequestDispatcher("/api/home");
			rd.forward(request, response); //forwards 
		} else  {
//			RequestDispatcher rd = request.getRequestDispatcher("/FailedLogin.html");
//			rd.forward(request, response); //forwards 
			
			response.setStatus(403);
			response.sendRedirect("http://localhost:8080/HelloFrontController/api/");
		}
		}
		
		
	}
	
	//Logout method has not been implemented. 
	public static void logout(HttpServletRequest request, HttpServletResponse response) throws IOException {
		
		request.getSession().invalidate();
		response.setStatus(200);
		response.sendRedirect("http://localhost:8080/HelloFrontController/api/");
		
	}

}

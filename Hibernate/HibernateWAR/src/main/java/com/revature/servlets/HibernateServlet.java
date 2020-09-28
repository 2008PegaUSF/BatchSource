package com.revature.servlets;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.revature.MainDriver;
import com.revature.dao.PlanetDao;


public class HibernateServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	
	private static PlanetDao pdao = new PlanetDao();


	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		PrintWriter pw = response.getWriter();
		
		pw.write(pdao.selectPlanetByName("Earth").toString());
	}


	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		MainDriver.insertInitialValues();
	}

}

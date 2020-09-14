package com.revature.controllers;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class RequestHelper {
	
	public static void processRequests(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		String s = request.getRequestURI();
		
		switch(s) {
		case "/HouseAdventure/left":
			
			RoomMover.left(request,response);
			
			break;
		case "/HouseAdventure/right":
			RoomMover.right(request,response);
			break;
		case "/HouseAdventure/back":
			RoomMover.back(request,response);
			break;
		case "/HouseAdventure/forward":
			RoomMover.forward(request,response);
			break;
		case "/HouseAdventure/":
			RoomMover.start(request,response);
		default:
			
		}
		
	}

}

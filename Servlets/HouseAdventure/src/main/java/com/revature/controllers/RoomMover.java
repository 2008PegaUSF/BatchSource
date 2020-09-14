package com.revature.controllers;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.revature.models.House;
import com.revature.models.Room;

public class RoomMover {
	
	public static Room getMeRoomFromName(String name) {
		List<Room> myRooms = House.createHouse();
		
		Room nextRoom = null;
		
		if(name.equals(myRooms.get(0).getName())) {
			nextRoom =myRooms.get(0); 
		} else if (name.equals(myRooms.get(1).getName())) {
			nextRoom =myRooms.get(1); 
		} else if (name.equals(myRooms.get(2).getName())) {
			nextRoom =myRooms.get(2); 
		}else {
			nextRoom =myRooms.get(3); 
		}
		
		return nextRoom;
	}

	public static void left(HttpServletRequest request, HttpServletResponse response) {
		// TODO Auto-generated method stub
		
	}

	public static void right(HttpServletRequest request, HttpServletResponse response) {
		// TODO Auto-generated method stub
		
	}

	public static void back(HttpServletRequest request, HttpServletResponse response) {
		// TODO Auto-generated method stub
		
	}

	public static void forward(HttpServletRequest request, HttpServletResponse response) throws IOException {
		HttpSession sesh = request.getSession(false);
		
		Room currentRoom = (Room) sesh.getAttribute("room");
		
		String nextRoomName = currentRoom.getForward();
		
		Room nextRoom = getMeRoomFromName(nextRoomName);
		
		sesh.setAttribute("room", nextRoom);
		
		PrintWriter pw = response.getWriter();
		
		response.setContentType("json/application");
		
		/*
		 * Marshalling Tools:
		 * 
		 * Jackson (or GSON) : JSON <-> POJO (REST)
		 * 
		 * JAX-WS: WSDL <-> JAVA (SOAP)
		 * 
		 * JAX-B: XML <-> POJO (REST & SOAP)
		 */
		
		pw.write(new ObjectMapper().writeValueAsString(nextRoom));
		
		
	}

	public static void start(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		HttpSession sesh = request.getSession();
		
		List<Room> myRooms = House.createHouse();
		
		sesh.setAttribute("room", myRooms.get(1));
		
		request.getRequestDispatcher("/navigationPage.html").forward(request, response);
		
		
	}

}

package com.revature.models;

import java.util.ArrayList;
import java.util.List;

public class House {
	
	private static List<Room> whateverIWantToCallIt = null;
	
	public static List<Room> createHouse() {
		
		if(whateverIWantToCallIt == null) {
			
			Room k = new Room("Kitchen");
			Room lob = new Room("Lobby");
			Room liv = new Room("Living Room");
			Room b = new Room("Bedroom");
			
			lob.setForward(k.getName());
			lob.setLeft(b.getName());
			
			liv.setRight(k.getName());
			liv.setBackward(b.getName());
			
			List<Room> whateverIWantToCallIt = new ArrayList<>();
			
			whateverIWantToCallIt.add(k);
			whateverIWantToCallIt.add(lob);
			whateverIWantToCallIt.add(liv);
			whateverIWantToCallIt.add(b);
			
		} else {
			System.out.println("Do nothing");
		}
		
		
		
		return whateverIWantToCallIt;
		
	}

}

package com.revature;

import com.revature.dao.PlanetDao;
import com.revature.models.Planet;

public class MainDriver {

	private static PlanetDao pdao = new PlanetDao();
	
	public static void insertInitialValues() {
		
		pdao.insert(new Planet(0, "Earth", "Bit Blue"));
		pdao.insert(new Planet(0, "Mars", "Bit Red"));
		pdao.insert(new Planet(0, "Mercury", null));
		
	}
	
	public static void main(String[] args) {

		insertInitialValues();
		
//		System.out.println(pdao.selectPlanetById(1));
//		System.out.println(pdao.selectPlanetById(2));
//		System.out.println(pdao.selectPlanetById(3));
		
		System.out.println(pdao.selectPlanetByName("Earth"));

	}

}

package com.revature.repository;

import java.util.ArrayList;
import java.util.List;

import com.revature.models.Planet;

public class PlanetDAOImplORACLE implements PlanetDAO {

	@Override
	public List<Planet> selectAll() {
		// Rather than hardcoding the data or going to postgres, we can send over to ORacle db 
		/*
		 * oracle logic 
		 */
		
		List<Planet> listOfPlanets = new ArrayList();
		
		listOfPlanets.add(new Planet("Mercury"));
		listOfPlanets.add(new Planet("Venus"));
		listOfPlanets.add(new Planet("Earth"));
		listOfPlanets.add(new Planet("Mars"));
		listOfPlanets.add(new Planet("Jupiter"));
		listOfPlanets.add(new Planet("Saturn"));
		listOfPlanets.add(new Planet("Pluto"));
		return listOfPlanets;
	}
	
	public void fancyMethod() {
		
	}

}

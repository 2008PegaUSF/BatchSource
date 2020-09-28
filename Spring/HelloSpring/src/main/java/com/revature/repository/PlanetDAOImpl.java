package com.revature.repository;

import java.util.ArrayList;
import java.util.List;

import com.revature.models.Planet;

public class PlanetDAOImpl implements PlanetDAO {
	
	

	@Override
	public List<Planet> selectAll() {
		
		/*
		 * 1000x quicker 
		 */
	List<Planet> listOfPlanets = new ArrayList();
	
	listOfPlanets.add(new Planet("Mercury"));
	listOfPlanets.add(new Planet("Venus"));
	listOfPlanets.add(new Planet("Earth"));
	listOfPlanets.add(new Planet("Mars"));
	listOfPlanets.add(new Planet("Jupiter"));
	listOfPlanets.add(new Planet("Saturn"));
	
		return listOfPlanets;
	}

}

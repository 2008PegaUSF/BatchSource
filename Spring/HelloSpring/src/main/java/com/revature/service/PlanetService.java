package com.revature.service;

import java.util.List;

import com.revature.models.Planet;

public interface PlanetService {
	
	public List<Planet> getTheSolarSystem();
	
	public void destroyPlanet(Planet p);
	
	public void destroyAllPlanets();
	
	public void terraformPlanet();

}

package com.revature.service;

import java.util.List;

import com.revature.models.Planet;
import com.revature.repository.PlanetDAO;
import com.revature.repository.PlanetDAOImpl;

public class PlanetServiceImpl implements PlanetService{
	
	private PlanetDAO pdao;
	
	

	public PlanetDAO getPdao() {
		return pdao;
	}

	public void setPdao(PlanetDAO pdao) {
		this.pdao = pdao;
	}

	@Override
	public List<Planet> getTheSolarSystem() {
		// TODO Auto-generated method stub
		System.out.println("Welcome to the Terra system!");
		return pdao.selectAll();
	}

	@Override
	public void destroyPlanet(Planet p) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void destroyAllPlanets() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void terraformPlanet() {
		// TODO Auto-generated method stub
		
	}
	
	

}

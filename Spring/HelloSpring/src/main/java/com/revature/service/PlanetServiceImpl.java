package com.revature.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.revature.models.Planet;
import com.revature.repository.PlanetDAO;

@Component("PlanetServiceFULLANNO")
public class PlanetServiceImpl implements PlanetService{
	
	@Autowired
	/*
	 * Field Injection is bad in some ways:
	 * 		Lack of Encapsulation 
	 * 		Unable to trigger additional setter or constructor logic 
	 * 		Tightly couples our application to the Spring IoC Container (not all frameworks allow us to do it)
	 */
	private PlanetDAO pdao;
	
	
	

	public PlanetServiceImpl() {
		super();
		// TODO Auto-generated constructor stub
	}
	
//	@Autowired
	public PlanetServiceImpl(PlanetDAO pdao) {
		super();
		this.pdao = pdao;
		System.out.println("Inside service, all args");
	}

	public PlanetServiceImpl(PlanetDAO pdao, int aNumber) {
		super();
		this.pdao = pdao;
		System.out.println("Inside service, all args");
	}

	public PlanetDAO getPdao() {
		return pdao;
	}

//	@Autowired //SETTER INJECTION
	public void setPdao(PlanetDAO pdao) {
		System.out.println("Inside setter, service layer");
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

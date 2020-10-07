package com.example.service;

import java.net.URI;
import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.example.model.Planet;
import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;

@Service
public class PlanetService {
	
//	These are Dependencies 
//	private PlanetDao pdao;
	private final RestTemplate restTemplate;
	
	public PlanetService(RestTemplate restTemplate) {
		super();
		this.restTemplate = restTemplate;
	}
	
	@HystrixCommand(fallbackMethod = "goodAllReliable")
	public List<Planet> getPlanetList(){
		
		//Defines the URI
		URI uri = URI.create("http://localhost:8100/api/getInnerPlanets");
		
		//initialy we have to pass in the URI and we'll receive List<Object>
		//This right here , is us levaraging other services. 
		List<Planet> rockyPlanets = (List<Planet>) this.restTemplate.getForObject(uri, List.class);
		
		rockyPlanets.add(new Planet(9, "Pluto"));
		
		return rockyPlanets;
		
	}
	

	public List<Planet> goodAllReliable(){
		List<Planet> fakeList = new ArrayList<>();
		
		fakeList.add(new Planet(-1000, "Fakey fake"));
		
		return fakeList;
	}

}

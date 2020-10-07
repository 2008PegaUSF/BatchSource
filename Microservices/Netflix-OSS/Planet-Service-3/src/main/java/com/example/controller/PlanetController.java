package com.example.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.web.client.RestTemplateBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import com.example.model.Planet;
import com.example.service.PlanetService;

@RestController
public class PlanetController {
	
	@Autowired
	private PlanetService planetService;
	
	@Bean //This defines the return value to be a bean that is managed by Spring 
	public RestTemplate rest(RestTemplateBuilder builder) {
		//This method returns RestTemplate 
		//So Spring will manage RestTemplate for us and inject it appropriately. 
		return builder.build();
	}
	
	@GetMapping("/rocky")
	public List<Planet> getPlanets(){
		return planetService.getPlanetList();
	}

}

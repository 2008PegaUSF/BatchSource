package com.example.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.model.Planet;

@RestController
@CrossOrigin
@RequestMapping("/api")
public class PlanetController {
	
	//localhost:numbers/api/getInnerPlanets
	@GetMapping("/getInnerPlanets")
	public List<Planet> getSomePlanet(){
		List<Planet> innerPlanets = new ArrayList<>();
		
		Planet p1 = new Planet(1, "Mercury");
		Planet p2 = new Planet(2, "Venus");
		Planet p3 = new Planet(3, "Earth");
		Planet p4 = new Planet(4, "Mars");
		
		innerPlanets.add(p1);
		innerPlanets.add(p2);
		innerPlanets.add(p3);
		innerPlanets.add(p4);
		
		return innerPlanets;
	}

}

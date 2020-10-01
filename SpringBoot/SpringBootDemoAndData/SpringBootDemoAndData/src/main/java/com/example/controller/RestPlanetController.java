package com.example.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.model.Planet;
import com.example.repo.PlanetDao;

@RestController
@RequestMapping("/api")
public class RestPlanetController {
	
	@Autowired
	private PlanetDao planetDao;
	
	@GetMapping("/getAllPlanets")
	public List<Planet> getAllPlanets(){
		return planetDao.findAll();
	}

}

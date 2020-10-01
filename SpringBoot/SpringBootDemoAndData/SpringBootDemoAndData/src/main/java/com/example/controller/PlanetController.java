package com.example.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseBody;

import com.example.model.Planet;
import com.example.repo.PlanetDao;

@Controller
public class PlanetController {
	
	private PlanetDao planetDao;

	@Autowired
	public PlanetController(PlanetDao planetDao) {
		super();
		this.planetDao = planetDao;
	}

//	@Autowired
	public void setPlanetDao(PlanetDao planetDao) {
		this.planetDao = planetDao;
	}
	
	@GetMapping("")
	public @ResponseBody List<Planet> getPlanets(){
		return planetDao.findAll();
	}
	
	@PostMapping("/insert")
	public @ResponseBody String insertPlanet(@RequestBody Planet planetJson) {
		
		planetDao.save(planetJson);
		
		return "success";
	}
	
	
	

}

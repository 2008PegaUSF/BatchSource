package com.example.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.model.Planet;
import com.example.repo.PlanetDao;


/*
 * What is a RESTful API?
 * 		An API that follows all the REST constraints. 
 * 
 * What are the REST constraints?
 * 
 * 1) Cacheable
 * 2) Stateless 
 * 3) Client-Server 
 * 4) Layered System 
 * 5) Uniform Interface : In short, each entitiy's api (uri) should follow the same pattern. No entity should have more than one uri.
 * 6) Code on demand (optional) 
 * 
 * More on uniform interface
 * 
 * GET: website.net/api/mymodel
 * 		>return full list of objects
 * 
 * GET: website.net/api/mymodel/{id}
 * 		>return a single object with this specific id 
 * 
 * POST: website.net/api/mymodel
 * 		>create a new record, body contains JSON
 * 
 * PUT: website.net/api/mymodel/{id}  OR /api/mymodel/update/{id}
 * 		>update record, body contains JSON
 * 
 * DELETE: website.net/api/mymodel/{id} 
 * 		>deleting record. 
 */

@RestController
@RequestMapping("/api")
@CrossOrigin(origins = "http://localhost:4200") //WARNING
//If you don't add "http" at the front, you STILL might get CORS issues 
//This means your server trusts the traffic from this origing, if you specify as *, they you're opening yourselfup to a lot of dangerers. 
public class RestPlanetController {
	
	@Autowired
	private PlanetDao planetDao;
	
	@GetMapping("/getAllPlanets")
	public List<Planet> getAllPlanets(){
		return planetDao.findAll();
	}
	
	

}

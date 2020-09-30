package com.example.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.ResponseStatus;

import com.example.dao.PlanetRepo;
import com.example.model.Planet;

@Controller
@RequestMapping(value = "/api")
@CrossOrigin(origins = "*")
public class PlanetController {
	
	/*
	 * @RequestMapping
	 * @<method>Mapping
	 * 
	 * @ResponseBody 
	 * @RequestBody
	 */
	
	@Autowired //Field Injection - BAD PRACTICE
	private PlanetRepo planetRepo;
	
//	@RequestMapping(value = "/createPlanet", method = RequestMethod.PUT)
	@PutMapping(value = "/createPlanet")
	public @ResponseBody String createNewPlanet(@RequestBody Planet incomingPlanet) {
		
		
		
		System.out.println("Inside put");
		
		planetRepo.insert(incomingPlanet);
		
		return "False";
	}
	
	/*
	 * Produces attirbutes specific to what you'll be producing and sending back.
	 * Consumes specifies what data format the user is giving back to you
	 */
	@ResponseStatus(value = HttpStatus.I_AM_A_TEAPOT)
	@GetMapping(value = "/getAllPlanets", produces = "application/json")
	public @ResponseBody List<Planet> getAllPlanets(){
		System.out.println("Inside get all");
		return planetRepo.selectAll();
	}
	
	
	/*
	 * Have a go at using path information to select planet by id and have a go at select planet by name using param values (chuck in a post mapping in there as well)
	 * 
	 * Use form information as well, somewhere. 
	 */
	

}

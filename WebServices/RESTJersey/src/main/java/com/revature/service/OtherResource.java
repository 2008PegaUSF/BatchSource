package com.revature.service;

import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.MultivaluedMap;

import com.revature.models.Planet;

@Path("/myresource")
public class OtherResource {
	
	
	@GET
	@Path("/greetings")
	@Produces("text/plain")
	public String greetings() {
		return "Hello";
	}
	
	@GET
	@Produces(MediaType.TEXT_PLAIN)
	public String goodbye() {
		return "Goodbye";
	}
	
	
	@POST
	@Path("/planet")
	@Produces(MediaType.APPLICATION_JSON)
	@Consumes("application/x-www-form-urlencoded")
	public Planet getPlanet(MultivaluedMap<String,String> formParams) {
		
		String name = formParams.get("name").get(0);
		
		return new Planet(name);
	}
	
	
	
	
	
	
	
}

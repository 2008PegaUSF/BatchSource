package com.revature.service;

import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.QueryParam;
import javax.ws.rs.core.Context;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.MultivaluedMap;
import javax.ws.rs.core.UriInfo;

import com.revature.models.Planet;

@Path("/myresource")
public class OtherResource {
	
	
	@GET
	@Path("/greetings/{name}")
	@Produces("text/plain")
	public String greetings(@PathParam("name") String name, @QueryParam("other") String other) { //I want to pass a "name" through to Java (through query)
		return "Hello " + name;
	}
	
	@GET
	@Produces(MediaType.TEXT_PLAIN)
	public String goodbye() {
		return "Goodbye";
	}
	
	@GET
	@Path("/IdontKnowAboutThis")
	public String aMethod(@Context UriInfo ui) {
		
		MultivaluedMap<String,String> queryParams = ui.getQueryParameters();
		
		
		
		String other = queryParams.get("other").get(0);
		
		
		return other;
		
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

package com.revature.repository;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Component;

import com.revature.models.Planet;


/*
 * Stereotype are annotations that tell Spring that THIS class is a Spring bean and should be treated as such 
 * 
 * There ia a hierarchy to these annotations. The ancestor tag is @Component.
 * @Component is used for a basic java class, that needs to be a bead but doesn't fit into a predetermined spot in these design patterns.
 * 
 * @Service : service us used for your service/business classes (the service layer)
 * @Repository : is used for you repo/dao classes (the day loayer)
 * @Controller : is used for your controller classes (the conroller layer)
 * @Configuration : us used for classes that have functionality to configure Spring
 * 		(in short, there is a way to configure spring without relying on the beans.xml)
 * @RestController : is the same as controller BUT it assumes your API will be aRESTful API. 
 * 
 * -----------------------------------------------------------------------------------------------------------------------------------------
 * 
 * @Bean is NOT a stereotype... but it can be used on a method, and Spring iwll call that mehtod, then whatever object is 
 * 	returned, will be a Spring bean. 
 * 
 * (@Bean annotation is used inside the @Configuration stereotype)
 */

@Component //Stereotypes don't need to be given more metadata if you don't wnat to... but you should at least name it. 
public class PlanetDAOImpl implements PlanetDAO {
	
	
	
	

	public PlanetDAOImpl() {
		super();
		// TODO Auto-generated constructor stub
		System.out.println("Hello, I'm in the DAO no args");
	}

	@Override
	public List<Planet> selectAll() {
		
		/*
		 * 1000x quicker 
		 */
	List<Planet> listOfPlanets = new ArrayList();
	
	listOfPlanets.add(new Planet("Mercury"));
	listOfPlanets.add(new Planet("Venus"));
	listOfPlanets.add(new Planet("Earth"));
	listOfPlanets.add(new Planet("Mars"));
	listOfPlanets.add(new Planet("Jupiter"));
	listOfPlanets.add(new Planet("Saturn"));
	
		return listOfPlanets;
	}

}

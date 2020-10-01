package com.example.repo;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import com.example.model.Planet;

public interface PlanetDao extends CrudRepository<Planet, Integer>{
	
	/*
	 * Implement our CRUD methods and then some for us. 
	 */
	
	public List<Planet> findAll();
//	public List<Planet> findByOrderByAgeDesc();
	public List<Planet> findByOrderByNameDesc();
	
	public Planet findByName(String planetName);
	public Planet findById(int asdf);
	
	/*
	 * PLEASE LOOK AT THE DOCUMENTATION FOR NAMING PATTERNS/CONVENTIONS:
	 * 
	 * https://docs.spring.io/spring-data/jpa/docs/current/reference/html/
	 */
	

}

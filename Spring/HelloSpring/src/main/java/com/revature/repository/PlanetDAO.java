package com.revature.repository;

import java.util.List;

import com.revature.models.Planet;

public interface PlanetDAO {
	
	/*
	 * DAO will have methods to get data from the database. In essence CRUD.
	 */
	
	//We are only creating the select method for brevity
	public List<Planet> selectAll();

}

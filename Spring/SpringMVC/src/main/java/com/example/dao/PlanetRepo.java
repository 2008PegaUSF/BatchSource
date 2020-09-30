package com.example.dao;

import java.util.List;

import org.hibernate.SessionFactory;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.example.model.Planet;

@Transactional
@Repository("planetRepo")
public class PlanetRepo {
	
	private SessionFactory sesFact;

	public PlanetRepo(SessionFactory sesFact) {
		super();
		this.sesFact = sesFact;
	}
	
	public void insert(Planet planet) {
		
		sesFact.getCurrentSession().save(planet);
	}
	
	public void update(Planet planet) {}
		
	public Planet selectById(int id) {
		
		return null;
	}
	
	public List<Planet> selectAll(){
		
		return sesFact.getCurrentSession().createQuery("from Planet", Planet.class).list();
	}
	

}

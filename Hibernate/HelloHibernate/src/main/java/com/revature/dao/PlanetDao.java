package com.revature.dao;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.Transaction;

import com.revature.models.Planet;
import com.revature.util.HibernateUtil;

public class PlanetDao {
	
	/*
	 * CRUD - that's how we interact with database
	 * 
	 * CREATE, READ, UPDATE, DELETE 
	 */
	
	public void insert(Planet p) {
		
		Session ses = HibernateUtil.getSession();
		Transaction tx = ses.beginTransaction();
		
		ses.save(p);
		
		tx.commit();
		ses.close();
		
	}
	
	public void update(Planet p) {
		
	}
	
	public void delete(Planet p) {
		
	}
	
	public List<Planet> selectAll(){
		return null;
	}
	
	public Planet selectPlanetByName(String name) {
		return null;
	}
	
	public Planet selectPlanetById(int id) {
		Session ses = HibernateUtil.getSession();
		
		Planet p = ses.get(Planet.class, id);
		
		ses.close();
		
		return p;
	}
	

}

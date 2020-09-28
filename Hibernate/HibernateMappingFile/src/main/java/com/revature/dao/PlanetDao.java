package com.revature.dao;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.criterion.Restrictions;

import com.revature.models.Planet;
import com.revature.util.HibernateUtil;

public class PlanetDao {
	
	/*
	 * CRUD - that's how we interact with database
	 * 
	 * CREATE, READ, UPDATE, DELETE 
	 * 
	 * 
	 * save() or persist()
	 * update()
	 * saveOrUpdate()
	 * delete()
	 * get() or load()
	 */
	
	public void insert(Planet p) {
		
		Session ses = HibernateUtil.getSession();
		Transaction tx = ses.beginTransaction();
		
		ses.save(p);
		
		tx.commit();
		ses.close();
		
	}
	
	public void update(Planet p) {
		
		Session ses = HibernateUtil.getSession();
		Transaction tx = ses.beginTransaction();
		
		ses.update(p);
		
		tx.commit();
		ses.close();
		
	}
	
	public void delete(Planet p) {
		
		Session ses = HibernateUtil.getSession();
		Transaction tx = ses.beginTransaction();
		
		ses.delete(p);
		
		tx.commit();
		ses.close();
		
	}
	
	public List<Planet> selectAll(){
		
		//Implement using native, hql, criteria api or builder
		return null;
	}
	
	public List<Planet> selectAllPlanetsWithRedInTheDescription(){
		//implement with whatever. Not with native SQL
		return null;
	}
	
	public Planet selectPlanetByName(String name) {
		
		Session ses = HibernateUtil.getSession();
		List<Planet> planetList = null;
		
		//Native SQL - Not modular at all, annoying to switch database 
		planetList = ses.createNativeQuery(" SELECT * FROM planet_table WHERE planet_name = '" + name + "'",Planet.class).list();
		
		//HQL - Hibernate Query language - combination of sql and java, we use psuedo query strings, but we'er referencing Java OBJECTS. 
		planetList = ses.createQuery("from Planet where name = '" + name + "'",Planet.class).list();
		
		//Criteria API - Criteria builder is newer, but it takes up more lines of code. 
		planetList = ses.createCriteria(Planet.class).add(Restrictions.ilike("name", name)).list();
		
		return planetList.get(0);
	}
	
	public Planet selectPlanetById(int id) {
		Session ses = HibernateUtil.getSession();
		
		Planet p = ses.get(Planet.class, id);
		
		ses.close();
		
		return p;
	}
	

}

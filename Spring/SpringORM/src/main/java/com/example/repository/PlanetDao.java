package com.example.repository;

import java.util.List;

import org.hibernate.SessionFactory;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.example.model.Planet;

@Transactional
@Repository("PlanetRepo")
public class PlanetDao {
	
	private SessionFactory sesFact;
	
	public PlanetDao(SessionFactory sesFact) {
		super();
		this.sesFact = sesFact;
	}

//	@Transactional
	public void insert(Planet p) {
		
//		Session ses = sesFact.openSession();
//		Transaction tx = ses.beginTransaction();
//		
//		ses.save(p);
//		
//		tx.commit();
//		ses.close();
		
		sesFact.getCurrentSession().save(p);
		
	}
	
	public void update(Planet p) {
		
	}
	
	public void delete(Planet p) {
		
	}
	
//	@Transactional
	public List<Planet> selectAll(){
		return sesFact.getCurrentSession().createQuery("from Planet", Planet.class).list();
	}

}

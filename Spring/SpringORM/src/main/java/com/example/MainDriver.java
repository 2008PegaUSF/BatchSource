package com.example;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.example.model.Planet;
import com.example.repository.PlanetDao;

public class MainDriver {
	
	private static ApplicationContext appContext = new ClassPathXmlApplicationContext("applicationContext.xml");
	
	private static PlanetDao planetDao = appContext.getBean("PlanetRepo", PlanetDao.class);
	
	public static void insertInitialValues() {
		planetDao.insert(new Planet(0, "Earth"));
		planetDao.insert(new Planet(0, "Mars"));
		planetDao.insert(new Planet(0, "Mercury"));
	}

	public static void main(String[] args) {
		insertInitialValues();
		
		System.out.println(planetDao.selectAll());
		
		System.out.println("All Done!");

	}

}

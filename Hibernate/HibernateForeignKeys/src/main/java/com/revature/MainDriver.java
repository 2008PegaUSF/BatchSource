package com.revature;

import java.util.ArrayList;
import java.util.List;

import com.revature.dao.FeatureDao;
import com.revature.dao.MoonDao;
import com.revature.dao.PlanetDao;
import com.revature.model.Feature;
import com.revature.model.Moon;
import com.revature.model.Planet;
import com.revature.util.HibernateUtil;

public class MainDriver {
	
	private static PlanetDao pdao = new PlanetDao();
	private static MoonDao mdao = new MoonDao();
	private static FeatureDao fdao = new FeatureDao();
	
	public static void main(String[] args) {
		
		insertInitialValues();
		
//		System.out.println(pdao.selectPlanetById(3));
		
		Planet newPlanet = pdao.selectPlanetById(1);
		
		System.out.println(newPlanet.getPlanetFeatures());
		
		HibernateUtil.closeSession();
		
		System.out.println(newPlanet.getPlanetFeatures());
	}
	
	
	public static void insertInitialValues() {
		
		Planet Mercury = new Planet("Mercury");
		Planet Mars = new Planet("Mars");
		Planet Earth = new Planet("Earth");
		
		Moon theMoon = new Moon(0, "The Moon", Earth);
		Moon phobos = new Moon(0, "Phobos", Mars);
		Moon deimos = new Moon(0, "Deimos", Mars);
		
		Feature mountain = new Feature("Mountain");
		Feature atmosphere = new Feature("Atmosphere");
		Feature crater = new Feature("Crater");
		Feature oceans = new Feature("Oceans");
		
		List<Moon> moonsOfMars = new ArrayList<>();
		List<Moon> moonsOfEarth = new ArrayList<>();
		
		List<Feature> featuresOfMercury = new ArrayList<>();
		List<Feature> featuresOfMars = new ArrayList<>();
		List<Feature> featuresOfEarth = new ArrayList<>();
		
		moonsOfMars.add(deimos);
		moonsOfMars.add(phobos);
		
		moonsOfEarth.add(theMoon);
		
		featuresOfEarth.add(oceans);
		featuresOfEarth.add(atmosphere);
		featuresOfEarth.add(mountain);
		featuresOfEarth.add(crater);
		
		featuresOfMercury.add(crater);
		
		featuresOfMars.add(crater);
		featuresOfMars.add(mountain);
		featuresOfMars.add(atmosphere);
		
		Mars.setMoons(moonsOfMars);
		Earth.setMoons(moonsOfEarth);
		
		Mercury.setPlanetFeatures(featuresOfMercury);
		Mars.setPlanetFeatures(featuresOfMars);
		Earth.setPlanetFeatures(featuresOfEarth);
		
		pdao.insert(Mercury);
		pdao.insert(Earth);
		pdao.insert(Mars);
		
		mdao.insert(deimos);
		mdao.insert(theMoon);
		mdao.insert(phobos);
		
//		fdao.insert(oceans);
//		fdao.insert(crater);
//		fdao.insert(atmosphere);
//		fdao.insert(mountain);
		
		
		
	}

}

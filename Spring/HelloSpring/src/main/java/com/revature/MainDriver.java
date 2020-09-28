package com.revature;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.revature.service.PlanetService;
import com.revature.service.PlanetServiceImpl;

/*
 * What is Spring?
 * 		Spring is a module based, open source, Java AOP framework. It provides support for enterprise level applications, it provides infrastructure so we can focus on business logic. 
 * 
 * What is a module?
 * 		A grouping of libraries that work together to achieve some goal using reusuable abstracted code. In Spring, module looks like a MAven dependency. 
 * 
 * What are modules in Spring?
 * 		Core, Beans, Context, ORM, AOP, WebMVC, Security, Test, etc. 
 * 
 * How does Spring achieve it's goals - i.e. what featuers does Spring have?
 * 		Inversion of Control (IoC)
 * 		AOP
 * 		Model View Controller Design Pattern (MVC)
 * 		A LOT of Abstracted APIs. 
 */

public class MainDriver {
	
	//This is Spring's IOC container. This IS Spring
	private static ApplicationContext appContext = new ClassPathXmlApplicationContext("beans.xml");
	
	
	//This is the old way of doing it!!!!
	private static PlanetService planetService;

	public static void main(String[] args) {
		
		planetService = appContext.getBean("PlanetServiceFIRST", PlanetService.class);
		
		
		System.out.println(planetService.getTheSolarSystem());

	}

}

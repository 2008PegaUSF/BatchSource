package com.revature;

import org.springframework.stereotype.Component;

@Component("appProxy")
public class ProxyApp {
	
	/*
	 * What are Cross Cutting Concerns?
	 * 		CCC is meta logic that an application needs, that is independent to the business logic. In other words, logic that EVERY application needs, 
	 * 			even before you consider specific businesss logic. 
	 * 
	 * Examples?
	 * 		Logging
	 * 		Security 
	 * 		Caching 
	 * 		Exception 
	 * 		Transaction 
	 */
	
	public ProxyApp() {
		
	}
	
	//Examples of CCC
	public void moonWalking() {
		// 5lines of security 
		// 7 lines dedicated to exception handling
		
		System.out.println("Look at me, I'm over the moon");
		
		//2 lines for caching 
		// 3 lines for logging
		
		//17 lines of code that have NOTHING to do with our own specific business logic. 
		
		
	}
	
	public Boolean launchingToMars(double fuel) {
		// .security()
		// .exceptionhandlng()
		
		System.out.println("Big explosions!");
		
		//.caching();
		// .logging()
		
		return true;
	}
	
	protected Boolean orbitEarth() {
		return false;
	}

	public Integer painting(int tools, double paint) {
		return 0;
	}
}

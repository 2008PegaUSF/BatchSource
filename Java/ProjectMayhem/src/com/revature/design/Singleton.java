package com.revature.design;

public class Singleton {
	/* Singleton Design Pattern
	 * ensure a class has only one instance and provides
	 * global access to it
	 */
	
	//private static instance of itself
	private static Singleton instance;
	
	//private constructor
	private Singleton() {
		//logic here
	}
	
	//Static method to get the unique instance- if it doesn't exist,we create it
	public static synchronized Singleton getInstance() {
		if( instance ==null) {
			instance= new Singleton();
		}
		return instance;
	}
	
	public void doSomething() {
		//logic- what the object should do
	}
}

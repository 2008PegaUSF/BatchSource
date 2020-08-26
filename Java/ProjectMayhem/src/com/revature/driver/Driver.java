package com.revature.driver;

import java.util.Date;

import com.revature.beans.Human;//<--grabs info from the human class
// import com.revature.beans.*
//static import - this only grabs static members of the class
//static import ...
public class Driver {
	//single comment
	/*
	 * Multi
	 * Line
	 * Comment
	 * Ha
	 * ha
	 */
	/*
	 * Why Java?
	 * "WORA" principal	
	 * 		"Write once, Run anywhere"
	 * OOP
	 * Widespread use
	 * Great Documentation!
	 * Oracle
	 * 	Sun Microsystems used to own it...
	 * version 1.8  "Java 8"
	 * 
	 * 3 common acronyms- JDK, JRE, JVM
	 * 	JVM- Java Virtual Machine
	 * 		 COnverts compiled Java code into machine code that your processor can understand
	 * 		 Provides portability
	 * 	JRE- Java Runtime Environment
	 * 		JVM + Libraries!
	 * 		Everything that we need to RUN java
	 * 	JDK- Java Development Kit
	 * 		COntains JVM + JRE
	 * 		Compiler, etc...
	 * 		Everything we need to WRITE Java
	 * Object Oriented Programming
	 * 	Java is ^!
	 *  unit of programmability is the object
	 *  Objects have states and behavior
	 *  States- aka fields, attributes, variables, etc.
	 *  Behaviors- methods
	 *  Classes- blueprint or template of an object 
	 * 
	 */
	public static void main(String[] args) {
		Date d=new Date();
		Date e= new Date();
		java.sql.Date f=new java.sql.Date(0);
		d= new Date();
		//d=java.sql.Date(34);
		/*public- access modifier, everything can access it
		 * static- do not need to instantiate to use/belongs to the class
		 * void- doesn't return anything
		 * String [] args- parameter(s) used for this method
		 * 
		 */
		//System.out.print("Go Team");
		
		
		
		System.out.println("Roll Tide");
		
		Human h= new Human("Abid", 22, 200);
		System.out.println(h);
		Human.setHomePlanet("Mars");
		Human i= new Human();
		System.out.println(i);
		i.getName();
//		h.setName("Matt");
//		h.setAge(34);
//		h.setWeight(270);
//		System.out.println(h.getName());
	}
}

package com.revature.beans;
//Packages are just very fancy folders. Namespace

import java.io.Serializable;

import com.revature.classtypes.Hunt;

/*
 * Naming Conventions
 * Classes and Projects: Pascal casing, Capitalize the first letter of each word ex. ProjectMayhem
 * Methods and variables: Camel casing,  ex. firstSecondThird
 * packages: lowercase and delimited by periods
 * Constants: ALL_CAPS_LOLZ typically delimited by underscores
 */

public class Human implements Hunt,Serializable{
	/**
	 * 
	 */
	private static final long serialVersionUID = -7374735978496017480L;

	/*
	 * Members of a class- couple of forms
	 * Instance variables-property of a specific object (human's name)
	 * Static variables - property of the class shared by all of it's instances
	 * Instance methods -behavior relative to a specific object
	 * Static methods- behavior relative to entire class
	 * constructor- instantiates the class using the keyword "new"
	 *
	 * Code Blocks- {things between}
	 */
		//Instance code block
	{System.out.println("I'm in an instance code block");}
	
	//Static code block
	static {System.out.println("I'm in a static code block");}
	
	
	//no args constructor
	public Human() {
		System.out.println("I'm in the no args constructor");
	}
	//constructor w/ fields
	 public Human(String name, int age, int weight) { 
		  //super(); 
		  this.name=name;
		  this.age=age;
		  this.weight=weight;
		  System.out.println("I'm in the constructor with fields");
	  }
	 public static String homePlanet ="Earth";
	
	private String name;
	private int age;
	private int weight;
	
	public static String getHomePlanet() {
		return homePlanet;
	}
	public static void setHomePlanet(String homePlanet) {
		Human.homePlanet = homePlanet;
	}
	public String getName() {
		  String s="woo";
		return name;
	}
	
	public void setName(String name) {
		this.name=name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public int getWeight() {
		return weight;
	}
	//example of shadowing!
	public void setWeight(int weight) {
		this.weight = weight; //weight is method scope; this.weight is instance scope
	}
	@Override
	public void findPrey() {
		System.out.println("I go to Walmart!");
		
	}

	@Override
	public String toString() {
		return "Human [name=" + name + ", age=" + age + ", weight=" + weight + ", homePlanet= " + homePlanet+" ]";
	}
	
}

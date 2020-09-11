package com.revature.models;

import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
public class Planet {
	
	private String name;

	public Planet(String name) {
		super();
		this.name = name;
	}

	public Planet() {
		super();
		// TODO Auto-generated constructor stub
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Override
	public String toString() {
		return "Planet [name=" + name + "]";
	}
	
	

}

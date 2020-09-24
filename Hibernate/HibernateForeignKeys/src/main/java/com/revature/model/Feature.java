package com.revature.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "features_table")
public class Feature {
	
	@Id
	@Column(name = "feature_id")
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int id;
	
	@Column(name = "feature_name", nullable = false)
	private String name;
	
	@Column(name = "feature_description")
	private String featureDescription;

	public Feature() {
		super();
		System.out.println("Inside no args");
		// TODO Auto-generated constructor stub
	}
	
	public Feature(String name) {
		this.name = name;
	}

	public Feature(int id, String name, String featureDescription) {
		super();
		this.id = id;
		this.name = name;
		this.featureDescription = featureDescription;
		System.out.println("Inside all args!");
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getFeatureDescription() {
		return featureDescription;
	}

	public void setFeatureDescription(String featureDescription) {
		this.featureDescription = featureDescription;
	}

	@Override
	public String toString() {
		return "Feature [id=" + id + ", name=" + name + ", featureDescription=" + featureDescription + "]";
	}
	
	

}

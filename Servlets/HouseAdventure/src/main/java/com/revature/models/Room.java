package com.revature.models;

public class Room {
	
	private String name;
	private String description;
	private String imageURL;
	
	private String left;
	private String right;
	private String forward;
	private String backward;
	
	
	
	
	public Room() {
		super();
		// TODO Auto-generated constructor stub
	}


	public Room(String name, String description, String imageURL, String left, String right, String forward,
			String backward) {
		super();
		this.name = name;
		this.description = description;
		this.imageURL = imageURL;
		this.left = left;
		this.right = right;
		this.forward = forward;
		this.backward = backward;
	}


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public String getDescription() {
		return description;
	}


	public void setDescription(String description) {
		this.description = description;
	}


	public String getImageURL() {
		return imageURL;
	}


	public void setImageURL(String imageURL) {
		this.imageURL = imageURL;
	}


	public String getLeft() {
		return left;
	}


	public void setLeft(String left) {
		this.left = left;
	}


	public String getRight() {
		return right;
	}


	public void setRight(String right) {
		this.right = right;
	}


	public String getForward() {
		return forward;
	}


	public void setForward(String forward) {
		this.forward = forward;
	}


	public String getBackward() {
		return backward;
	}


	public void setBackward(String backward) {
		this.backward = backward;
	}


	public Room(String name) {
		this.name  = name;
	}


	@Override
	public String toString() {
		return "Room [name=" + name + ", description=" + description + ", imageURL=" + imageURL + ", left=" + left
				+ ", right=" + right + ", forward=" + forward + ", backward=" + backward + "]";
	}
	
	

}

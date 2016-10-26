package com.songsong;

public abstract class Auto {
 	private int id;
 	private String name;
 	private float price;
 	
	public Auto(int id, String name, float price) {
		this.id = id;
		this.name = name;
		this.price = price;
	}

	protected int getId() {
		return id;
	}

	protected void setId(int id) {
		this.id = id;
	}

	protected String getName() {
		return name;
	}

	protected void setName(String name) {
		this.name = name;
	}

	protected float getPrice() {
		return price;
	}

	protected void setPrice(float price) {
		this.price = price;
	}	
}

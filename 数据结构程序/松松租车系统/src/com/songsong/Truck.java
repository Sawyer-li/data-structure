package com.songsong;

public class Truck extends Auto {
	int boadload;

	public Truck(int id, String name, float price, int boadload) {
		super(id, name, price);
		this.boadload = boadload;
	}

	protected int getBoadload() {
		return boadload;
	}

	protected void setBoadload(int boadload) {
		this.boadload = boadload;
	}
	
}

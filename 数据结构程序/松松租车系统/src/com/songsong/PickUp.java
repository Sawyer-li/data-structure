package com.songsong;

public class PickUp extends Auto {
	int person;
	int boadload;
	public PickUp(int id, String name, float price, int person, int boadload) {
		super(id, name, price);
		this.person = person;
		this.boadload = boadload;
	}
	protected int getPerson() {
		return person;
	}
	protected void setPerson(int person) {
		this.person = person;
	}
	protected int getBoadload() {
		return boadload;
	}
	protected void setBoadload(int boadload) {
		this.boadload = boadload;
	}
	
}

package com.songsong;

public class Car extends Auto {
	int person;

	public Car(int id, String name, float price, int person) {
		super(id, name, price);
		this.person = person;
	}

	public int getPerson() {
		return person;
	}

	public void setPerson(int person) {
		this.person = person;
	}


	
}

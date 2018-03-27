package com.dnoda;

public class Incorporation {
	private String name;
	private int yearOfIncorporation;

	public Incorporation(String name, int yearOfIncorporation) {
		this.name = name;
		this.yearOfIncorporation = yearOfIncorporation;
	}
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getYearOfIncorporation() {
		return yearOfIncorporation;
	}

	public void setYearOfIncorporation(int yearOfIncorporation) {
		this.yearOfIncorporation = yearOfIncorporation;
	}

	@Override
	public String toString() {
		return "Incorporation [name=" + name + ", yearOfIncorporation=" + yearOfIncorporation + "]";
	}
}

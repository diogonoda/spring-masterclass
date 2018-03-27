package com.dnoda.spring;

public class Incorporation {
	private String name;
	private int yearOfIncorporation;
	private int employeeCount;
	private int postalCode;

	public Incorporation(String name, int yearOfIncorporation) {
		super();
		this.name = name;
		this.yearOfIncorporation = yearOfIncorporation;
	}

	public int getEmployeeCount() {
		return employeeCount;
	}

	public void setEmployeeCount(int employeeCount) {
		this.employeeCount = employeeCount;
	}

	public void setPostalCode(int postalCode) {
		this.postalCode = postalCode;
	}

	@Override
	public String toString() {
		return "Incorporation [name=" + name + ", yearOfIncorporation=" + yearOfIncorporation + ", employeeCount="
				+ employeeCount + ", postalCode=" + postalCode + "]";
	}
}

package com.dnoda.spring.domain;

import com.dnoda.spring.service.BusinessService;

public class Organization {
	private String name;
	private int yearOfIncorporation;
	private int employeeCount;
	public String getName() {
		return name;
	}

	private int postalCode;
	private String slogan;
	private BusinessService businessService;

	public Organization(String name, int yearOfIncorporation) {
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

	public void setSlogan(String slogan) {
		this.slogan = slogan;
	}

	public void setBusinessService(BusinessService businessService) {
		this.businessService = businessService;
	}

	public void setPostalCode(int postalCode) {
		this.postalCode = postalCode;
	}

	public String corporateSlogan() {
		return slogan;
	}
	
	public String corporateService() {
		return businessService.offerService(name);
	}
	
	@Override
	public String toString() {
		return "Incorporation [name=" + name + ", yearOfIncorporation=" + yearOfIncorporation + ", employeeCount="
				+ employeeCount + ", postalCode=" + postalCode + "]";
	}
}

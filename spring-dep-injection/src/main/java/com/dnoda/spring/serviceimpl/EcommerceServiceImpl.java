package com.dnoda.spring.serviceimpl;

import java.util.Random;

import com.dnoda.spring.service.BusinessService;

public class EcommerceServiceImpl implements BusinessService {

	public String offerService(String companyName) {
		Random random = new Random();
		String service = "Ecommerce name " + companyName + "\nIncome is " + random.nextInt(revenue);
		
		return service;
	}

}

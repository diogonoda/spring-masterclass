package com.dnoda.spring.serviceimpl;

import java.util.Random;

import com.dnoda.spring.service.RecruitmentService;

public class AgencyRecruitmentServiceImpl implements RecruitmentService {

	public String recruitEmployees(String companyName, String departmentName, int numberOfRecruitments) {
		Random random = new Random();
		String hiringFacts = companyName + " hired " + random.nextInt(numberOfRecruitments) + " employees for department " + departmentName 
									+ " using agencies";
		
		return hiringFacts;
	}

}

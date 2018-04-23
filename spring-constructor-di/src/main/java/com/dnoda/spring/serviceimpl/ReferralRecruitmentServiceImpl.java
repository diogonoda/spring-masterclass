package com.dnoda.spring.serviceimpl;

import java.util.Random;

import com.dnoda.spring.service.RecruitmentService;

public class ReferralRecruitmentServiceImpl implements RecruitmentService{

	public String recruitEmployees(String companyName, String departmentName, int numberOfRecruitments) {
		Random random = new Random();
		String hiringFacts = companyName + " hired " + random.nextInt(numberOfRecruitments) + " for department " + departmentName
							+ " referred by employees";
		
		return hiringFacts;
	}

}

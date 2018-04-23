package com.dnoda.spring.domain;

import com.dnoda.spring.service.RecruitmentService;

public class HumanResourcesDepartment implements Department {

	private String departmentName;
	private RecruitmentService recruitmentService;
	private Organization organization;

	public HumanResourcesDepartment(RecruitmentService recruitmentService, Organization organization) {
		super();
		this.recruitmentService = recruitmentService;
		this.organization = organization;
	}

	public void setDepartmentName(String departmentName) {
		this.departmentName = departmentName;
	}

	public String hiringStatus(int numberOfRecruitments) {
		String hiringFacts = recruitmentService.recruitEmployees(organization.getName(), departmentName, numberOfRecruitments);

		return hiringFacts;
	}

}

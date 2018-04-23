package com.dnoda.spring;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.dnoda.spring.domain.HumanResourcesDepartment;
import com.dnoda.spring.domain.Organization;

public class DIConstructorApp {

	public static void main(String[] args) {
		ApplicationContext applicationContext = new ClassPathXmlApplicationContext("bean-setter.xml");

		Organization organization = (Organization) applicationContext.getBean("organization-bean");
		
//		System.out.println(organization);
		
//		System.out.println(organization.corporateService());
		
		HumanResourcesDepartment humanResourcesDepartment = (HumanResourcesDepartment) applicationContext.getBean("humanresources-bean");
		
		System.out.println(humanResourcesDepartment.hiringStatus(500));
		
		((ClassPathXmlApplicationContext) applicationContext).close();
	}

}

package com.dnoda.spring;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.dnoda.spring.domain.Organization;

public class DepInjectionApp {

	public static void main(String[] args) {
		ApplicationContext applicationContext = new ClassPathXmlApplicationContext("bean-setter.xml");

		Organization organization = (Organization) applicationContext.getBean("organization-bean");
		
		System.out.println(organization);
		
		System.out.println(organization.corporateService());
		
		((ClassPathXmlApplicationContext) applicationContext).close();
	}

}

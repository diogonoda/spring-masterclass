package com.dnoda.spring;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.dnoda.spring.domain.Organization;

public class DepInjectionApp {

	public static void main(String[] args) {
		ApplicationContext applicationContext = new ClassPathXmlApplicationContext("bean-setter.xml");

		Organization organization = (Organization) applicationContext.getBean("organization-bean");
		Organization organization2 = (Organization) applicationContext.getBean("organization-bean");
		organization2.setPostalCode(111111);
		
		System.out.println(organization);
		System.out.println(organization2);
		
		if(organization == organization2) {
			System.out.println("equals");
		} else {
			System.out.println("different");
		}
		
		System.out.println(organization.corporateService());
		
		((ClassPathXmlApplicationContext) applicationContext).close();
	}

}

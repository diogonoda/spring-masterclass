package com.dnoda.spring_ioc_demo;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;

public class IOCApp1 {

	public static void main(String[] args) {
		ApplicationContext applicationContext = new FileSystemXmlApplicationContext("beans.xml");

		Organization organization = (Organization) applicationContext.getBean("my-org");
		
		organization.corporateSlogan();
		
		((FileSystemXmlApplicationContext) applicationContext).close();
	}

}

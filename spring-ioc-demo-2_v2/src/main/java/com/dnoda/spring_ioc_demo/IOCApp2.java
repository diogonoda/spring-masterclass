package com.dnoda.spring_ioc_demo;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author dnoda
 *
 */
public class IOCApp2 {

	public static void main(String[] args) {
//		ApplicationContext applicationContext = new FileSystemXmlApplicationContext("beans.xml");
		ApplicationContext applicationContext = new ClassPathXmlApplicationContext("beans-cp.xml");

		Organization organization = (Organization) applicationContext.getBean("my-org");
		
		organization.corporateSlogan();
		
		((ClassPathXmlApplicationContext) applicationContext).close();
	}

}

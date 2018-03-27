package com.dnoda.spring;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class AppSetter {

	public static void main(String[] args) {
		ApplicationContext applicationContext = new ClassPathXmlApplicationContext("bean-setter.xml");

		Incorporation incorporation = (Incorporation) applicationContext.getBean("bean-setter");
		
		System.out.println(incorporation);
		
		((ClassPathXmlApplicationContext) applicationContext).close();
	}

}

package com.dnoda;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class AppConstructor {
	public static void main(String[] args) {
		ApplicationContext applicationContext = new ClassPathXmlApplicationContext("bean-constructor.xml");
		
		Incorporation incorporation = (Incorporation) applicationContext.getBean("bean-constructor");
		
		System.out.println(incorporation);
		
		((ClassPathXmlApplicationContext) applicationContext).close();
	}
}

package com.dnoda;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;

public class IOCApp1 {
	public static void main(String[] args) {
		ApplicationContext applicationContext = new FileSystemXmlApplicationContext("src/main/resources/bean.xml");		
		
		City city = (City) applicationContext.getBean("my-city");
		
		city.cityMessage();
		
		((FileSystemXmlApplicationContext) applicationContext).close();
	}
}

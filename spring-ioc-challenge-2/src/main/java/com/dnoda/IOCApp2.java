package com.dnoda;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class IOCApp2 {

	public static void main(String[] args) {
		ApplicationContext applicationContext = new ClassPathXmlApplicationContext("beans-challenge-2.xml");
		
		State state = (State) applicationContext.getBean("my-bean-challenge-2");
		
		state.stateMessage();
		
		((ClassPathXmlApplicationContext) applicationContext).close();;

	}

}

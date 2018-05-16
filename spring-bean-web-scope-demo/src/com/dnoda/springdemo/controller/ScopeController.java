package com.dnoda.springdemo.controller;

import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.dnoda.springdemo.service.RandomizeRequestScope;
import com.dnoda.springdemo.service.RandomizeSessionScope;

@Controller
public class ScopeController {

	@Autowired
	RandomizeRequestScope randomizerRequestScope;
	
	@Autowired
	RandomizeSessionScope randomizerSessionScope;
	
	@RequestMapping("/")
	public void getRandom(HttpServletResponse httpServletResponse) throws Exception {
		httpServletResponse.getWriter().write("<html><body>");
		httpServletResponse.getWriter().write("************  REQUEST SCOPE  ************* <br> ");
		httpServletResponse.getWriter().write("Old number : " + randomizerRequestScope.getRandomNumber() + " <br> ");
		randomizerRequestScope.generateRandomNumber();
		httpServletResponse.getWriter().write("New number : " + randomizerRequestScope.getRandomNumber() + " <br> ");
		httpServletResponse.getWriter().write("Object reference : " + randomizerRequestScope + " <br> ");
		
		httpServletResponse.getWriter().write("************  SESSION SCOPE  ************* <br> ");
		httpServletResponse.getWriter().write("Old number : " + randomizerSessionScope.getRandomNumber() + " <br> ");
		randomizerSessionScope.generateRandomNumber();
		httpServletResponse.getWriter().write("New number : " + randomizerSessionScope.getRandomNumber() + " <br> ");
		httpServletResponse.getWriter().write("Object reference : " + randomizerSessionScope + " <br> ");
		httpServletResponse.getWriter().write("</body></html>");
	}
}

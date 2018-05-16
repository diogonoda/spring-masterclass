package com.dnoda.springdemo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.dnoda.service.demo.GenericWelcomeService;

@Controller
public class WelcomeController {
	
	@Autowired
	private GenericWelcomeService welcomeService;

	@RequestMapping("/")
	public String doWelcome(Model model) {
//		WelcomeService welcomeService = new WelcomeService();
		List<String> welcomeMessage = welcomeService.getWelcomeMessage("Dunha");

		model.addAttribute("myWelcomeMessage", welcomeMessage);
		
		return "welcomeNew";
	}
}

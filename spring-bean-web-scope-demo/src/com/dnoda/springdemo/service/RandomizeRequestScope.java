package com.dnoda.springdemo.service;

public class RandomizeRequestScope {
	private int randomNumber = 5;
	
	public int getRandomNumber() {
		return randomNumber;
	}
	
	public void generateRandomNumber() {
		this.randomNumber = (int) (Math.random() * 2);
	}
}

package com.rajesh.spring.config;

public class Car {
	
	private String name;
	
	public void setup() {
		System.out.println("### inside setup");
	}
	
	 
	
	public void cleanup() {
		System.out.println("### inside cleanup");
	}



	public String getName() {
		return name;
	}



	public void setName(String name) {
		this.name = name;
	}


}

package com.rajesh.spring.core.ioc;

import java.beans.ConstructorProperties;

public class ExampleBean {
	private int years;
	 
	private String ultimateAnswer;

	@ConstructorProperties({"x","y"}) // change this names and see
	public ExampleBean(int years, String ultimateAnswer) {
		this.years = years;
		this.ultimateAnswer = ultimateAnswer;
	}
}

package com.rajesh.spring.annotation;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Required;

public class Student {
	
	private String name;
	
	@Autowired(required=true)
	private Address address;
	
	
	private RollNo rollNo;
	

	
	public RollNo getRollNo() {
		return rollNo;
	}
	
	@Autowired
	@Required
	public void setRollNo(RollNo rollNo) {
		this.rollNo = rollNo;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Address getAddress() {
		return address;
	}

	public void setAddress(Address address) {
		this.address = address;
	}
	
	

}

package com.rajesh.spring.annotation;

import javax.annotation.Resource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Required;

public class PhysicsStudent {
	
	private String name;
	
	@Resource
	private Address address;
	
	@Resource 
	private RollNo rollNo;
	
	@Resource(name="rollNo100") 
	private RollNo rollNo100;
	
	@Resource 
	private RollNo rollNo50;
	
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

	public RollNo getRollNo100() {
		return rollNo100;
	}

	public void setRollNo100(RollNo rollNo100) {
		this.rollNo100 = rollNo100;
	}

	public RollNo getRollNo50() {
		return rollNo50;
	}

	public void setRollNo50(RollNo rollNo50) {
		this.rollNo50 = rollNo50;
	}
	
	

}

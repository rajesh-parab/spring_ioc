package com.rajesh.spring.annotation;

import org.springframework.beans.factory.annotation.Autowired;

public class MathStudent {

	private String name;
	
 
	private Address address;
	
	
	private RollNo rollNo;
	
	@Autowired
	public MathStudent(RollNo rollNo) {
		this.rollNo=rollNo;
	}

	/*@Autowired(required=false)
	public MathStudent(RollNo rollNo, Address address) {
		
		this.address=address;
		this.rollNo=rollNo;

	}*/

	/*@Autowired(required=false)
	public MathStudent(RollNo rollNo, Address address,String name) {
		
		this.address=address;
		this.rollNo=rollNo;
		this.name=name;
	}*/
	
	public Address getAddress() {
		return address;
	}

	public RollNo getRollNo() {
		return rollNo;
	}
	

}

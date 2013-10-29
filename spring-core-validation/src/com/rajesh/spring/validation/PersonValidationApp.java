package com.rajesh.spring.validation;

import org.springframework.validation.BindException;
import org.springframework.validation.Errors;
import org.springframework.validation.FieldError;
import org.springframework.validation.ObjectError;

public class PersonValidationApp {

	public static void main(String[] args) {
		 
		Person person= new Person();
		person.setAge(-11);
		person.setName("sachin");
		
		PersonValidator personValidator = new PersonValidator();
		
		Errors errors=new BindException(person,"person");
		
		personValidator.validate(person, errors);
		
		for(ObjectError e : errors.getAllErrors()){
			System.out.println(e.getCode());
			System.out.println(e.getDefaultMessage());
			
			 
		}
		System.out.println("################");
		 
		for(FieldError e : errors.getFieldErrors()){
			System.out.println(e.getCode());
			System.out.println(e.getDefaultMessage());
			
			 
		}
	}

}

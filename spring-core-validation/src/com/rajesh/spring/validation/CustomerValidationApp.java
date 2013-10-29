package com.rajesh.spring.validation;

import org.springframework.validation.BindException;
import org.springframework.validation.Errors;
import org.springframework.validation.ObjectError;
import org.springframework.validation.Validator;

public class CustomerValidationApp {

	public static void main(String[] args) {
		Address address= new Address();
		address.setCity("mumbai");
		address.setCountry("usa");
		
		Customer customer = new Customer();
		customer.setAddress(address);
		customer.setFirstName("rajesh");
		customer.setSurname("parab");
		
		Validator addressValidator= new AddressValidator();
		CustomerValidator customerValidator = new CustomerValidator(addressValidator);
		
		 
		Errors errors=new BindException(customer,"customer");
		
		customerValidator.validate(customer, errors);
		
		for(ObjectError e : errors.getAllErrors()){
			System.out.println(e.getCode());
		}

	}

}

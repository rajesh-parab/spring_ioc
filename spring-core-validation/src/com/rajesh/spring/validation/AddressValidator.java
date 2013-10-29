package com.rajesh.spring.validation;

import org.springframework.validation.Errors;
import org.springframework.validation.Validator;

public class AddressValidator implements Validator {

	@Override
	public boolean supports(Class<?> clazz) {
		return Address.class.equals(clazz);
	}

	@Override
	public void validate(Object address, Errors errors) {
		 
	 
		Address add = (Address) address;
		if (add.getCity().equals("mumbai") && !add.getCountry().equals("india")) {
			errors.rejectValue("country", add.getCity() + " is not in "+add.getCountry());
		} 

	}

}

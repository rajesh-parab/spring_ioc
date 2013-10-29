package com.rajesh.spring.validation;

import org.springframework.validation.Errors;
import org.springframework.validation.ValidationUtils;
import org.springframework.validation.Validator;

public class PersonValidator implements Validator  {

	@Override
	public boolean supports(Class<?> clazz) {
		return Person.class.equals(clazz);
	}

	@Override
	public void validate(Object person, Errors errors) {
		 
		ValidationUtils.rejectIfEmpty(errors, "name", "name.empty");
		Person p = (Person) person;
		if (p.getAge() < 0) {
			errors.rejectValue("age", "negativevalue"," value is negateive");
		} else if (p.getAge() > 110) {
			 
			errors.rejectValue("age", "too.darn.old");
		}

	}

	 

}

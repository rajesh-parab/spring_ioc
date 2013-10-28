package com.rajesh.spring.config;

import org.springframework.beans.factory.annotation.Autowired;

public class CustomerService {

	@Autowired
	private CustomerDao customerDao;

	public CustomerDao getCustomerDao() {
		return customerDao;
	}
	
	
	
}

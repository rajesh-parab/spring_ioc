package com.rajesh.spring.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
 
public class AppContext3 {

	@Bean
	public CustomerService customerService() {
		CustomerService customerService = new CustomerService();

		return customerService;

	}

	@Bean
	public CustomerDao customerDao() {
		CustomerDao customerDao = new CustomerDao();

		return customerDao;

	}
}

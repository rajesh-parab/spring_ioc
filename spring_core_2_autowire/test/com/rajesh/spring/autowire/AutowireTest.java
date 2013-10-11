package com.rajesh.spring.autowire;

import static org.junit.Assert.*;

import org.junit.Test;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.AbstractJUnit4SpringContextTests;

@ContextConfiguration("classpath:com/rajesh/spring/context/autowire-beans.xml")
public class AutowireTest extends AbstractJUnit4SpringContextTests {
 

	@Test
	public void testAutowireCandidateTrue() {
	 
		Customer customer = applicationContext.getBean("customer",Customer.class);
		assertNotNull(customer);
		assertNotNull(customer.getOrder());
		assertNull(customer.getOrder().getItem());
		assertNotNull(customer.getCart());
	}
	
	@Test
	public void testAutowireCandidateByName() {
	 
		GoldCustomer customer = applicationContext.getBean("goldCustomer",GoldCustomer.class);
		assertNotNull(customer);
		assertNotNull(customer.getGoldOrder());
	 
	}

}

package com.rajesh.spring.core.naming;
import static org.junit.Assert.assertNotNull;

import org.junit.Test;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.AbstractJUnit4SpringContextTests;

import com.rajesh.spring.core.AxisBank;
import com.rajesh.spring.core.Bank;
import com.rajesh.spring.core.SBIBank;


@ContextConfiguration("classpath:com/rajesh/spring/context/beans.xml")
public class NamingBeanTest extends AbstractJUnit4SpringContextTests  {
 
	
	
	@Test
	public void testSimpleBean() {
		Bank sbiBank = applicationContext.getBean("sbiBankAccount", SBIBank.class); 
		assertNotNull(sbiBank);
	 
	}
	@Test
	public void testMultipleIdsWithComma() {
		Bank sbiBank = applicationContext.getBean("sbiBank,stateBank", SBIBank.class); 
		assertNotNull(sbiBank);
	 
	}
	
	@Test
	public void testMultipleNamesWithComma() {
		Bank sbiBank = applicationContext.getBean("sbiBank", SBIBank.class); 
		assertNotNull(sbiBank);
		Bank sbiBank2 = applicationContext.getBean("stateBank", SBIBank.class); 
		assertNotNull(sbiBank2);
	 
	}
	@Test
	public void testAlias() {
		Bank utiBank = applicationContext.getBean("utiBank", AxisBank.class); 
		assertNotNull(utiBank);
		Bank axisBank = applicationContext.getBean("axisBank", AxisBank.class); 
		assertNotNull( axisBank);
	 
	}
}

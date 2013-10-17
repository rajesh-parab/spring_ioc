package com.rajesh.spring.core.factory;

import static org.junit.Assert.assertNotNull;

import org.junit.Test;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.AbstractJUnit4SpringContextTests;

import com.rajesh.spring.core.instantiation.Car;


@ContextConfiguration("classpath:com/rajesh/spring/context/beans8.xml")
public class CarFactoryBeanTest extends AbstractJUnit4SpringContextTests  {
 
	@Test
	public void testCarFactoryBean(){
		Car car = applicationContext.getBean("carFactory", Car.class);
		assertNotNull(car);
	}
 
}

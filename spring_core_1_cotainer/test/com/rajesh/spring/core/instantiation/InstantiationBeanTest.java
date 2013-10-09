package com.rajesh.spring.core.instantiation;
import static org.junit.Assert.*;

import org.junit.Test;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.AbstractJUnit4SpringContextTests;


@ContextConfiguration("classpath:com/rajesh/spring/context/beans2.xml")
public class InstantiationBeanTest extends AbstractJUnit4SpringContextTests  {
 
	
	
	@Test
	public void testInnerStatic() {
		Car.Engine engine =(Car.Engine) applicationContext.getBean("engine"); 
		assertNotNull(engine);
		assertTrue(engine instanceof Car.Engine );
	 
	}
	@Test
	public void testStaticFactoryMethod() {
		ClientService clientService =  applicationContext.getBean("clientService",ClientService.class); 
		assertNotNull(clientService);
	 
	}
	
	@Test
	public void testJavaSingletonPattern(){
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext(
				"classpath:com/rajesh/spring/context/beans2.xml");
		ClientService clientService =  context.getBean("clientService",ClientService.class); 
		ClassPathXmlApplicationContext context2 = new ClassPathXmlApplicationContext(
				"classpath:com/rajesh/spring/context/beans2.xml");
		ClientService clientService2 =  context2.getBean("clientService",ClientService.class);
		 
		assertSame(clientService,clientService2);
	}
	@Test
	public void testInstanceFactoryMethod(){
		Car car =  applicationContext.getBean("car",Car.class); 
		assertNotNull(car);
	}
	
	@Test
	public void testMultipleInstanceFactoryMethod(){
		Truck truck =  applicationContext.getBean("truck",Truck.class); 
		assertNotNull(truck);
		Bus bus =  applicationContext.getBean("bus",Bus.class); 
		assertNotNull(bus);
		
	}
	
	
}

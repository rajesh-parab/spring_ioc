package com.rajesh.spring.config;

import static org.junit.Assert.*;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.PropertySourcesPlaceholderConfigurer;

public class ConfigTest {

	@Test
	public void testConfig() {
		ApplicationContext ctx = new AnnotationConfigApplicationContext(
				AppContext.class);

		ClassRoom classRoom = ctx.getBean("classRoom", ClassRoom.class);
		assertNotNull(classRoom);
		assertNotNull(classRoom.getCourse());
		assertNotNull(classRoom.getCourse().getSubject());

	}

	@Test
	public void testDoubleConfig() {
		ApplicationContext ctx = new AnnotationConfigApplicationContext(
				AppContext.class);
		AnnotationConfigApplicationContext ctx2 = new AnnotationConfigApplicationContext();
		ctx2.register(AppContext.class);
		ctx2.refresh();

		ClassRoom classRoom = ctx.getBean("classRoom", ClassRoom.class);
		assertNotNull(classRoom);
		assertNotNull(classRoom.getCourse());
		assertNotNull(classRoom.getCourse().getSubject());

		ClassRoom classRoom2 = ctx2.getBean("classRoom", ClassRoom.class);
		assertNotNull(classRoom2);
		assertNotSame(classRoom,classRoom2);

	}
	
	@Test
	public void testLifeCycle() {
		ApplicationContext ctx = new AnnotationConfigApplicationContext(
				AppContext.class);
		Car car = ctx.getBean("car", Car.class);
		 
		
	}
	@Test
	public void testScope() {
		ApplicationContext ctx = new AnnotationConfigApplicationContext(
				AppContext.class);
	 
		Car car = ctx.getBean("car", Car.class);
		Car car2 = ctx.getBean("car", Car.class);
		assertSame(car,car2);
		
		Car bmwCar = ctx.getBean("bmwCar", Car.class);
		Car bmwCar2 = ctx.getBean("bmwCar", Car.class);
		assertNotSame(bmwCar,bmwCar2);
		
	}
	@Test
	public void testImportXml() {
		ApplicationContext ctx = new AnnotationConfigApplicationContext(
				AppContext2.class);

		ClassRoom classRoom = ctx.getBean("classRoom", ClassRoom.class);
		assertNotNull(classRoom);
		assertNotNull(classRoom.getCourse());
		assertNotNull(classRoom.getCourse().getSubject());
		Car car = ctx.getBean("car", Car.class);
		assertNotNull(car);

	}
	@Test
	public void testProperties() {
		ApplicationContext ctx = new AnnotationConfigApplicationContext(
				AppContext2.class);

		Car car = ctx.getBean("car", Car.class);
		assertNotNull(car);
		System.out.println(car.getName()); 

	}
	@Test
	public void testAutowired() {
		ApplicationContext ctx = new AnnotationConfigApplicationContext(
				AppContext3.class);

		CustomerService customerService = ctx.getBean("customerService", CustomerService.class);
		assertNotNull(customerService);
		assertNotNull(customerService.getCustomerDao()); 

	}
}

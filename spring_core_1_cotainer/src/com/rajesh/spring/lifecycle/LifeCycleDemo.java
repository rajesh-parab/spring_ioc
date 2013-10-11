package com.rajesh.spring.lifecycle;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class LifeCycleDemo {

	public static void main(String[] args) {
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext(
				"classpath:com/rajesh/spring/context/beans6.xml");
		Entity entity =  context.getBean("entity",Entity.class); 
		 
		 
 
	}

}

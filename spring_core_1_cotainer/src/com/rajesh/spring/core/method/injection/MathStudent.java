package com.rajesh.spring.core.method.injection;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MathStudent {

	public static void main(String[] args) {
		
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext(
				"classpath:com/rajesh/spring/context/beans5.xml");
		Calculator calci =  context.getBean("calculator",Calculator.class); 
		int i= calci.multiply(10, 3);
		System.out.println(" answer is i "+i);
		

	}

}

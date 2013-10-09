package com.rajesh.spring.core;

import java.util.Arrays;

import org.springframework.beans.factory.config.BeanDefinition;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.context.support.GenericApplicationContext;
import org.springframework.context.support.StaticApplicationContext;

public class SpringApplication {

	public static void main(String[] args) throws Exception {

		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext(
				"classpath:com/rajesh/spring/context/beans.xml");
		Bank sbiBank = context.getBean("sbiBankAccount", SBIBank.class);
 
		

	}

}

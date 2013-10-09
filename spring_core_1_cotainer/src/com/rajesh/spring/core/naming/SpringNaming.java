package com.rajesh.spring.core.naming;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.rajesh.spring.core.Bank;
import com.rajesh.spring.core.SBIBank;
import com.rajesh.spring.core.instantiation.ClientService;

public class SpringNaming {

	public static void main(String[] args) {
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext(
				"classpath:com/rajesh/spring/context/beans2.xml");
		ClientService clientService =  context.getBean("clientService",ClientService.class); 
		ClassPathXmlApplicationContext context2 = new ClassPathXmlApplicationContext(
				"classpath:com/rajesh/spring/context/beans2.xml");
		ClientService clientService2 =  context2.getBean("clientService",ClientService.class);
		if(clientService==clientService2){
			System.out.println(" BEAN IS SAME IT IS JAVA SINGLE TON");
		}
		 
 
	}

}

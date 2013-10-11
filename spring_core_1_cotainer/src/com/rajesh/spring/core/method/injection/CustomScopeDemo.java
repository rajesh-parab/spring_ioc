package com.rajesh.spring.core.method.injection;

import org.springframework.beans.factory.config.Scope;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.context.support.SimpleThreadScope;

import com.rajesh.spring.core.ioc.Dvd;

public class CustomScopeDemo {

	public static void main(String[] args) {
		
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext(
				"classpath:com/rajesh/spring/context/beans5.xml");
		Scope threadScope = new SimpleThreadScope();
	//	context.getBeanFactory().registerScope("thread", threadScope);
		Dvd dvd =  context.getBean("dvd2",Dvd.class); 
		Dvd dvd2 =  context.getBean("dvd2",Dvd.class); 

		 System.out.println(" *********** COMPARE thread IN SAME CONTEXT  ");
		 System.out.println(dvd+"  ==  "+dvd2);
		 System.out.println(dvd == dvd2);
 
	}

}

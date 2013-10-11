package com.rajesh.spring.core.method.injection;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.rajesh.spring.core.ioc.Dvd;

public class ScopeDemo {

	public static void main(String[] args) {
		
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext(
				"classpath:com/rajesh/spring/context/beans5.xml");
		HackedCalculator calci =  context.getBean("hackedCalculator",HackedCalculator.class); 
		HackedCalculator calci2 =  context.getBean("hackedCalculator",HackedCalculator.class);
		
		 System.out.println(" *********** COMPARE SINGLETON IN SAME CONTEXT  ");
		 System.out.println(calci+"  ==  "+calci2);
		 System.out.println(calci == calci2);
		 ClassPathXmlApplicationContext context2 = new ClassPathXmlApplicationContext(
					"classpath:com/rajesh/spring/context/beans5.xml");
		 System.out.println(" *********** COMPARE SINGLETON IN DIFFERENT CONTEXT  ");
		 HackedCalculator calci3 =  context2.getBean("hackedCalculator",HackedCalculator.class);
		 
	
		 
		 System.out.println(calci3+"  ==  "+calci2);
		 System.out.println(calci3==calci2);
		 System.out.println(" *********** COMPARE PROTOTYPE IN SAME CONTEXT  ");
		 
		 Dvd dvd1 =  context2.getBean("dvd",Dvd.class);
		 
		 Dvd dvd2 =  context2.getBean("dvd",Dvd.class);
		 System.out.println(dvd1+"  ==  "+dvd2);
		 System.out.println(dvd1==dvd2);
		 

	}

}

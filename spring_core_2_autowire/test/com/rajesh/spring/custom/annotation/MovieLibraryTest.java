package com.rajesh.spring.custom.annotation;

import static org.junit.Assert.*;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

 
public class MovieLibraryTest  {
 

	@Test
	public void testAnnotation() {
  
		ApplicationContext context = new ClassPathXmlApplicationContext("com/rajesh/spring/context/annotation-beans3.xml");
  
 
		MovieLibrary movieLibrary=context.getBean("movieLibrary",MovieLibrary.class);
		assertTrue(context.containsBean("movieLibrary"));
	 
		 assertNotNull(movieLibrary);
	  assertNotNull(movieLibrary.getMovieCatalog());
	}
	
	 

}

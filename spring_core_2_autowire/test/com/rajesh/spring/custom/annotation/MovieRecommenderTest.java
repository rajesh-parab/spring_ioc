package com.rajesh.spring.custom.annotation;

import static org.junit.Assert.*;

import org.junit.Test;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.AbstractJUnit4SpringContextTests;

@ContextConfiguration("classpath:com/rajesh/spring/context/annotation-beans2.xml")
public class MovieRecommenderTest extends AbstractJUnit4SpringContextTests {
 

	@Test
	public void testAnnotation() {
		MovieRecommender movieRecommender =super.applicationContext.getBean("movieRecommender",MovieRecommender.class);
		
		assertNotNull(movieRecommender.getActionCatalog());
		assertNotNull(movieRecommender.getComedyCatalog());
	}
	
	 

}

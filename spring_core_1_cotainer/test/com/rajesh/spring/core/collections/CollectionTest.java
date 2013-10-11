package com.rajesh.spring.core.collections;

import static org.junit.Assert.*;

import org.junit.Test;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.AbstractJUnit4SpringContextTests;

@ContextConfiguration("classpath:com/rajesh/spring/context/collections.xml")
public class CollectionTest extends AbstractJUnit4SpringContextTests {

	
	@Test
	public void list() {
		CollectionHolder holder = applicationContext.getBean(
				"collectionHolder", CollectionHolder.class);
		assertTrue(holder.getNames().size() == 2);
		assertTrue(holder.getFoodItems().size() == 2);
	 
	}

	@Test
	public void properties() {
		CollectionHolder holder = applicationContext.getBean(
				"collectionHolder", CollectionHolder.class);

		assertTrue(holder.getEmails().size() == 3);
		assertTrue(holder.getEmails().get("administrator")
				.equals("administrator@example.org"));
	}
	@Test
	public void maps() {
		CollectionHolder holder = applicationContext.getBean(
				"collectionHolder", CollectionHolder.class);
		assertTrue(holder.getStringMaps().get("one").equals("i am one"));
	 
	}
	
	@Test
	public void set() {
		CollectionHolder holder = applicationContext.getBean(
				"collectionHolder", CollectionHolder.class);
		assertTrue(holder.getMixSet().contains(applicationContext.getBean("foodItem1")));
	 
	}
}

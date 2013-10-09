package com.rajesh.spring.core.ioc;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertTrue;
import static org.junit.Assert.fail;

import org.junit.Test;
import org.springframework.beans.factory.BeanCreationException;
import org.springframework.beans.factory.BeanCurrentlyInCreationException;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.AbstractJUnit4SpringContextTests;

@ContextConfiguration("classpath:com/rajesh/spring/context/beans3.xml")
public class IOCTest extends AbstractJUnit4SpringContextTests {

	@Test
	public void testConstInjection() {
		DVDPlayer dvdPlayer = (DVDPlayer) applicationContext
				.getBean("dvdPlayer");
		assertNotNull(dvdPlayer);

	}

	@Test
	public void testConstInjectionObjects() {
		Transport transport = (Transport) applicationContext
				.getBean("transport");
		assertNotNull(transport);

	}

	@Test
	public void testConstInjectionByType() {
		ExampleBean exampleBean = (ExampleBean) applicationContext
				.getBean("exampleBean");
		assertNotNull(exampleBean);

	}

	@Test
	public void testConstInjectionByIndex() {
		ExampleBean exampleBean2 = (ExampleBean) applicationContext
				.getBean("exampleBean2");
		assertNotNull(exampleBean2);

	}

	@Test
	public void testConstInjectionByConsPropertiesAnnotation() {
		ExampleBean exampleBean3 = (ExampleBean) applicationContext
				.getBean("exampleBean3");
		assertNotNull(exampleBean3);

	}

	@Test
	public void testSetterInjection() {
		Customer customer = applicationContext.getBean("customer",
				Customer.class);
		assertNotNull(customer);

	}

	@Test
	public void circularDependancyWithSetter() {
		Chicken chicken = applicationContext.getBean("chicken", Chicken.class);
		assertNotNull(chicken);
		Egg egg = applicationContext.getBean("egg", Egg.class);
		assertNotNull(egg);

	}

	@Test
	public void circularDependancyWithConstructor() {
		try {

			ApplicationContext context = new ClassPathXmlApplicationContext(
					"classpath:com/rajesh/spring/context/beans4.xml");
			Chicken2 chicken = context.getBean("chicken2", Chicken2.class);

			Egg2 egg = context.getBean("egg2", Egg2.class);

			fail(" should have been fail on constructor circular dependancy");

		} catch (BeanCreationException ex) {
			if (ex.getRootCause() instanceof BeanCurrentlyInCreationException) {
				assertTrue(true);
			} else {
				fail(" should have been BeanCurrentlyInCreationException");
			}
 
		}

	}

	@Test
	public void testIdRef() {
		Customer customer = applicationContext.getBean("customer2",
				Customer.class);
		assertNotNull(customer);
		assertEquals(customer.getOrderBeanName(), "order");
		Customer customer3 = applicationContext.getBean("customer3",
				Customer.class);
	 	//assertEquals(customer3.getOrderBeanName(), "order");
	}

	@Test
	public void testNestedBean() {
		Customer customer = applicationContext.getBean("customer4",
				Customer.class);
		assertNotNull(customer);
		assertNotNull(customer.getOrder());
		assertEquals("books",customer.getOrder().getItem());
	}

	@Test
	public void testParentBean() {
		 ApplicationContext  parent = new ClassPathXmlApplicationContext(
				"classpath:com/rajesh/spring/context/parent.xml");
	 
		ClassPathXmlApplicationContext child = new ClassPathXmlApplicationContext(
				new String[]{"classpath:com/rajesh/spring/context/child.xml"},parent);
		
		Customer customer = child.getBean("customer", Customer.class);
		assertNotNull(customer);
		assertNotNull(customer.getOrder());
		assertEquals("booksOfParent",customer.getOrder().getItem());
		
		
		Customer customer2 = child.getBean("customer2", Customer.class);
		assertNotNull(customer2);
		assertNotNull(customer2.getOrder());
		assertEquals("booksOfChild",customer2.getOrder().getItem());
		
	}
	@Test
	public void testCompoundPropery() {
		Customer customer5 = applicationContext.getBean("customer5",
				Customer.class);
		assertEquals("pizza",customer5.getOrder().getItem());
	}
	

}

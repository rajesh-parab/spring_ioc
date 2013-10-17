package com.rajesh.spring.core.property;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertTrue;

import java.io.IOException;
import java.util.Properties;

import org.junit.Test;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;
import org.springframework.core.io.support.EncodedResource;
import org.springframework.core.io.support.PropertiesLoaderUtils;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.AbstractJUnit4SpringContextTests;
import org.springframework.util.DefaultPropertiesPersister;
import org.springframework.util.PropertiesPersister;


@ContextConfiguration("classpath:com/rajesh/spring/context/beans7.xml")
public class PropertyTest extends AbstractJUnit4SpringContextTests  {
 
	
	
	@Test
	public void testProperty() throws IOException {
		MyDataSource myDataSource = applicationContext.getBean("myDataSource", MyDataSource.class); 
		assertNotNull(myDataSource);
		
		Properties props = new Properties();
		Resource location =   new ClassPathResource("com/rajesh/spring/context/jdbc.properties");
	 
	 
		PropertiesLoaderUtils.fillProperties(
				props, location);
	 
		 
		assertTrue(myDataSource.getDbUrl().equals(props.get("jdbc.url")));
		assertTrue(myDataSource.getUserName().equals(props.get("jdbc.username")));
	 
	}
	@Test
	public void testPropertyOverride() throws IOException {
		MyDataSource myDataSource = applicationContext.getBean("myDataSource2", MyDataSource.class); 
		assertNotNull(myDataSource);
		
		Properties props = new Properties();
		Resource location =   new ClassPathResource("com/rajesh/spring/context/jdbc.properties");
	 
	 
		PropertiesLoaderUtils.fillProperties(
				props, location);
		
		Properties props2 = new Properties();
		Resource location2 =   new ClassPathResource("com/rajesh/spring/context/override.properties");
	 
	 
		PropertiesLoaderUtils.fillProperties(
				props2, location2);
	 
		 
		assertTrue(myDataSource.getDbUrl().equals(props.get("jdbc.url")));
		assertTrue(myDataSource.getUserName().equals(props2.get("myDataSource2.userName")));
	 
	}
 
}

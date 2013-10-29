package com.rajesh.spring.validation;

import static org.junit.Assert.*;

import java.text.SimpleDateFormat;

import org.junit.Test;
import org.springframework.beans.propertyeditors.CustomDateEditor;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.rajesh.spring.property.editor.Car;

public class CustomDateEditorTest {

	@Test
	public void testCustomDateEditor() {
		
		String validDate = "01/01/2005";
		
		CustomDateEditor editor = new CustomDateEditor(new SimpleDateFormat("MM/dd/yyyy"), true);
		editor.setAsText(validDate);
	 
		assertEquals("01/01/2005", editor.getAsText());
		System.out.println(editor.getValue().getClass());
	}
	@Test
	public void testCustomTyreEditor() {
		
		 ApplicationContext context = new ClassPathXmlApplicationContext("classpath:com/rajesh/spring/property/editor/beans.xml");
		 Car car= context.getBean("car",Car.class);
		 
		 assertNotNull(car);
		 
		 assertNotNull(car.getTyre());
		 System.out.println(car.getTyre().getTyreName());
		 
	}
}

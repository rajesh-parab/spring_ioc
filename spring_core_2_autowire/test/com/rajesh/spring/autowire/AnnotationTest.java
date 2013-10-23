package com.rajesh.spring.autowire;

import static org.junit.Assert.assertNotNull;

import org.junit.Test;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.AbstractJUnit4SpringContextTests;

import com.rajesh.spring.annotation.MathStudent;
import com.rajesh.spring.annotation.Student;

@ContextConfiguration("classpath:com/rajesh/spring/context/annotation-beans.xml")
public class AnnotationTest extends AbstractJUnit4SpringContextTests {

	@Test
	public void simpleFieldAutoWire() {

		Student student = (Student) applicationContext.getBean("student",
				Student.class);
		assertNotNull(student);
		assertNotNull(student.getAddress());

	}

	@Test
	public void constructorAutoWire() {

		MathStudent student = (MathStudent) applicationContext.getBean(
				"mathStudent", MathStudent.class);
		assertNotNull(student);
		assertNotNull(student.getRollNo());
		//assertNotNull(student.getAddress());

	}
	
	
	

}

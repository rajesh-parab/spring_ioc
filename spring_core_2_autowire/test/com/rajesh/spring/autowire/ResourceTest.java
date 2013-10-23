package com.rajesh.spring.autowire;

import static org.junit.Assert.*;

import org.junit.Test;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.AbstractJUnit4SpringContextTests;

import com.rajesh.spring.annotation.MathStudent;
import com.rajesh.spring.annotation.PhysicsStudent;

@ContextConfiguration("classpath:com/rajesh/spring/context/resource-annotation-beans.xml")
public class ResourceTest extends AbstractJUnit4SpringContextTests {

	@Test
	public void simpleFieldAutoWire() {

		PhysicsStudent student = (PhysicsStudent) applicationContext.getBean("physicsStudent",
				PhysicsStudent.class);
		assertNotNull(student);
		assertNotNull(student.getAddress());
		assertNotNull(student.getRollNo());
		assertNotNull(student.getRollNo50());
		assertNotNull(student.getRollNo100());
		assertNotSame(student.getRollNo(),student.getRollNo100());
		assertSame(student.getRollNo(),student.getRollNo50());
		System.out.println(student.getRollNo100().getNumber());
		System.out.println(student.getRollNo50().getNumber());
		System.out.println(student.getRollNo().getNumber());

	}

	 
	

}

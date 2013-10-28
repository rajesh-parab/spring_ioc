package com.rajesh.spring.core.resource;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import java.io.IOException;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;
import org.springframework.core.io.UrlResource;

public class ResourceTest {

	@Test
	public void testUrlResourceWithRelativePath() throws IOException {
		Resource resource = new UrlResource("file:dir/");
		System.out.println(resource.getFile().getName());
		Resource relative = resource.createRelative("subdir");
		System.out.println(relative.getFile().getAbsolutePath());
		assertEquals(new UrlResource("file:dir/subdir"), relative);
	}

	@Test
	public void testNonFileResourceExists() throws Exception {
		Resource resource = new UrlResource("http://www.google.com");
		assertTrue(resource.exists());

		byte b[] = new byte[100];

		resource.getInputStream().read(b);
		String s = new String(b);
		System.out.println(s);
	}

	@Test
	public void testClassPathResourceWithRelativePath() throws IOException {
		Resource resource = new ClassPathResource(
				"com/rajesh/spring/core/resource/ResourceTest.class");

		assertEquals("ResourceTest.class", resource.getFilename());
		byte b[] = new byte[100];
		resource.getInputStream().read(b);
		System.out.println(new String(b));
		assertTrue(resource.getURL().getFile().endsWith("ResourceTest.class"));

	}

	@Test
	public void testClassPathResource() throws IOException {
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext(
				"classpath:com/rajesh/spring/context/beans.xml");
		
		/*ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext(
				"beans.xml",MyService.class);*/
		Resource template = context
				.getResource("com/rajesh/spring/context/myTemplate.txt");
		byte b[] = new byte[100];
		template.getInputStream().read(b);
		System.out.println(new String(b));
	}

}

package com.rajesh.spring.core.collections;

import java.util.List;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class CollectionMerging {

	private List<String> names;

	public List<String> getNames() {
		return names;
	}

	public void setNames(List<String> names) {
		this.names = names;
	}
	
	public static void main(String[] args) {
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext(
				"classpath:com/rajesh/spring/context/collections.xml");
		CollectionMerging merge=	context.getBean("specialNames",CollectionMerging.class);
		
		for(String name : merge.getNames()){
			System.out.println("  --> "+name);
		}
		
 
	}

}

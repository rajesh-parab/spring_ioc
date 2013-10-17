package com.rajesh.spring.lifecycle;

import javax.annotation.PostConstruct;

import org.springframework.beans.factory.InitializingBean;

public class Entity implements InitializingBean  {

	private String name;
 
	@PostConstruct
	public void postinit(){
		System.out.println(" post init");
	}
	
	public void setupEntity(){
		System.out.println(" init method ");
	}
	public Entity(){
		System.out.println("  Entity constructor ");
	}

	
	public String getName() {
		return name;
	}


	public void setName(String name) {
		System.out.println(" setting name ");
		this.name = name;
	}


	@Override
	public void afterPropertiesSet() throws Exception {
	 
		System.out.println("  after properties set ");
	}

	
}

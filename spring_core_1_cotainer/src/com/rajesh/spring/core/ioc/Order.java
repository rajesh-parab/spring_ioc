package com.rajesh.spring.core.ioc;

public class Order {
	
	private String item;
	
	public Order(){
		System.out.println(" ## Order consturctor ");
	}

	public String getItem() {
		return item;
	}

	public void setItem(String item) {
		this.item = item;
	}
	
	
}

package com.rajesh.spring.core.ioc;

public class Customer {

	private Order order;
	
	private String orderBeanName;
	
	public Customer(){
		System.out.println(" ## customer consturctor ");
	}

	public Order getOrder() {
		return order;
	}

	public void setOrder(Order order) {
		System.out.println("   in set order method of customer ");
		this.order = order;
	}

	public String getOrderBeanName() {
		return orderBeanName;
	}

	public void setOrderBeanName(String orderBeanName) {
		this.orderBeanName = orderBeanName;
	}
	
	 
}

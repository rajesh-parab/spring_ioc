package com.rajesh.spring.autowire;

public class Customer {

	private Order order;
	
	private ShoppingCart cart;
	

	public Order getOrder() {
		return order;
	}

	public void setOrder(Order order) {
		this.order = order;
	}

	public ShoppingCart getCart() {
		return cart;
	}

	public void setCart(ShoppingCart cart) {
		this.cart = cart;
	}
	
	
}

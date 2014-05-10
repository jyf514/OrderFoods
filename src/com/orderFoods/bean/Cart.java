package com.orderFoods.bean;

import java.util.HashMap;

public class Cart {
	private Customer customer;
	private HashMap<Dish, Integer> cart;
	public Customer getCustomer() {
		return customer;
	}
	public void setCustomer(Customer customer) {
		this.customer = customer;
	}
	public HashMap<Dish, Integer> getCart() {
		return cart;
	}
	public void setCart(HashMap<Dish, Integer> cart) {
		this.cart = cart;
	}
	
}

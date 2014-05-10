package com.orderFoods.bean;

/**
 * Orderdetail entity. @author MyEclipse Persistence Tools
 */
public class Orderdetail extends AbstractOrderdetail implements
		java.io.Serializable {

	// Constructors

	/** default constructor */
	public Orderdetail() {
	}

	/** full constructor */
	public Orderdetail(Order order, String restaurant, String dishName,
			Integer number, Integer price) {
		super(order, restaurant, dishName, number, price);
	}

}

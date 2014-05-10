package com.orderFoods.bean;

import java.util.Set;

/**
 * Dish entity. @author MyEclipse Persistence Tools
 */
public class Dish extends AbstractDish implements java.io.Serializable {

	// Constructors

	/** default constructor */
	public Dish() {
	}

	/** minimal constructor */
	public Dish(Restaurant restaurant, String dishName, Double price,
			String isSoldOut) {
		super(restaurant, dishName, price, isSoldOut);
	}

	/** full constructor */
	public Dish(Restaurant restaurant, String dishName, Double price,
			String isSoldOut, String image, Set comments) {
		super(restaurant, dishName, price, isSoldOut, image, comments);
	}

}

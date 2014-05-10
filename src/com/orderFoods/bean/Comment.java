package com.orderFoods.bean;

import java.util.Date;

/**
 * Comment entity. @author MyEclipse Persistence Tools
 */
public class Comment extends AbstractComment implements java.io.Serializable {

	// Constructors

	/** default constructor */
	public Comment() {
	}

	/** minimal constructor */
	public Comment(Dish dish, Customer customer, Date date, Integer grade) {
		super(dish, customer, date, grade);
	}

	/** full constructor */
	public Comment(Dish dish, Customer customer, String comment, Date date,
			Integer grade) {
		super(dish, customer, comment, date, grade);
	}

}

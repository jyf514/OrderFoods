package com.orderFoods.bean;

import java.sql.Timestamp;
import java.util.Set;

/**
 * Order entity. @author MyEclipse Persistence Tools
 */
public class Order extends AbstractOrder implements java.io.Serializable {

	// Constructors

	/** default constructor */
	public Order() {
	}

	/** minimal constructor */
	public Order(Timestamp dateTime, String state) {
		super(dateTime, state);
	}

	/** full constructor */
	public Order(Restaurant restaurant, Timestamp dateTime, String state,
			String userName, Set orderdetails) {
		super(restaurant, dateTime, state, userName, orderdetails);
	}

}

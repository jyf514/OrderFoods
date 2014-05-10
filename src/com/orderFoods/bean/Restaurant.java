package com.orderFoods.bean;

import java.util.Set;

/**
 * Restaurant entity. @author MyEclipse Persistence Tools
 */
public class Restaurant extends AbstractRestaurant implements
		java.io.Serializable {

	// Constructors

	/** default constructor */
	public Restaurant() {
	}

	/** minimal constructor */
	public Restaurant(Type type, Seller seller, Zone zone,
			String restaurantName, String address, String phoneNumber) {
		super(type, seller, zone, restaurantName, address, phoneNumber);
	}

	/** full constructor */
	public Restaurant(Type type, Seller seller, Zone zone,
			String restaurantName, String address, String phoneNumber,
			String introduction, Integer checkPrice, String businessHour,
			String isOpen, Set dishs, Set orders) {
		super(type, seller, zone, restaurantName, address, phoneNumber,
				introduction, checkPrice, businessHour, isOpen, dishs, orders);
	}

}

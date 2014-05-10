package com.orderFoods.bean;

import java.sql.Timestamp;
import java.util.HashSet;
import java.util.Set;

/**
 * AbstractOrder entity provides the base persistence definition of the Order
 * entity. @author MyEclipse Persistence Tools
 */

public abstract class AbstractOrder implements java.io.Serializable {

	// Fields

	private Integer orderId;
	private Restaurant restaurant;
	private Timestamp dateTime;
	private String state;
	private String userName;
	private Set orderdetails = new HashSet(0);

	// Constructors

	/** default constructor */
	public AbstractOrder() {
	}

	/** minimal constructor */
	public AbstractOrder(Timestamp dateTime, String state) {
		this.dateTime = dateTime;
		this.state = state;
	}

	/** full constructor */
	public AbstractOrder(Restaurant restaurant, Timestamp dateTime,
			String state, String userName, Set orderdetails) {
		this.restaurant = restaurant;
		this.dateTime = dateTime;
		this.state = state;
		this.userName = userName;
		this.orderdetails = orderdetails;
	}

	// Property accessors

	public Integer getOrderId() {
		return this.orderId;
	}

	public void setOrderId(Integer orderId) {
		this.orderId = orderId;
	}

	public Restaurant getRestaurant() {
		return this.restaurant;
	}

	public void setRestaurant(Restaurant restaurant) {
		this.restaurant = restaurant;
	}

	public Timestamp getDateTime() {
		return this.dateTime;
	}

	public void setDateTime(Timestamp dateTime) {
		this.dateTime = dateTime;
	}

	public String getState() {
		return this.state;
	}

	public void setState(String state) {
		this.state = state;
	}

	public String getUserName() {
		return this.userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public Set getOrderdetails() {
		return this.orderdetails;
	}

	public void setOrderdetails(Set orderdetails) {
		this.orderdetails = orderdetails;
	}

}
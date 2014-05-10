package com.orderFoods.bean;

/**
 * AbstractOrderdetail entity provides the base persistence definition of the
 * Orderdetail entity. @author MyEclipse Persistence Tools
 */

public abstract class AbstractOrderdetail implements java.io.Serializable {

	// Fields

	private Integer orderDetailId;
	private Order order;
	private String restaurant;
	private String dishName;
	private Integer number;
	private Integer price;

	// Constructors

	/** default constructor */
	public AbstractOrderdetail() {
	}

	/** full constructor */
	public AbstractOrderdetail(Order order, String restaurant, String dishName,
			Integer number, Integer price) {
		this.order = order;
		this.restaurant = restaurant;
		this.dishName = dishName;
		this.number = number;
		this.price = price;
	}

	// Property accessors

	public Integer getOrderDetailId() {
		return this.orderDetailId;
	}

	public void setOrderDetailId(Integer orderDetailId) {
		this.orderDetailId = orderDetailId;
	}

	public Order getOrder() {
		return this.order;
	}

	public void setOrder(Order order) {
		this.order = order;
	}

	public String getRestaurant() {
		return this.restaurant;
	}

	public void setRestaurant(String restaurant) {
		this.restaurant = restaurant;
	}

	public String getDishName() {
		return this.dishName;
	}

	public void setDishName(String dishName) {
		this.dishName = dishName;
	}

	public Integer getNumber() {
		return this.number;
	}

	public void setNumber(Integer number) {
		this.number = number;
	}

	public Integer getPrice() {
		return this.price;
	}

	public void setPrice(Integer price) {
		this.price = price;
	}

}
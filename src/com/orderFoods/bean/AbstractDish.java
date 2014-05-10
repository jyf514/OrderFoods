package com.orderFoods.bean;

import java.util.HashSet;
import java.util.Set;

/**
 * AbstractDish entity provides the base persistence definition of the Dish
 * entity. @author MyEclipse Persistence Tools
 */

public abstract class AbstractDish implements java.io.Serializable {

	// Fields

	private Integer dishiId;
	private Restaurant restaurant;
	private String dishName;
	private Double price;
	private String isSoldOut;
	private String image;
	private Set comments = new HashSet(0);

	// Constructors

	/** default constructor */
	public AbstractDish() {
	}

	/** minimal constructor */
	public AbstractDish(Restaurant restaurant, String dishName, Double price,
			String isSoldOut) {
		this.restaurant = restaurant;
		this.dishName = dishName;
		this.price = price;
		this.isSoldOut = isSoldOut;
	}

	/** full constructor */
	public AbstractDish(Restaurant restaurant, String dishName, Double price,
			String isSoldOut, String image, Set comments) {
		this.restaurant = restaurant;
		this.dishName = dishName;
		this.price = price;
		this.isSoldOut = isSoldOut;
		this.image = image;
		this.comments = comments;
	}

	// Property accessors

	public Integer getDishiId() {
		return this.dishiId;
	}

	public void setDishiId(Integer dishiId) {
		this.dishiId = dishiId;
	}

	public Restaurant getRestaurant() {
		return this.restaurant;
	}

	public void setRestaurant(Restaurant restaurant) {
		this.restaurant = restaurant;
	}

	public String getDishName() {
		return this.dishName;
	}

	public void setDishName(String dishName) {
		this.dishName = dishName;
	}

	public Double getPrice() {
		return this.price;
	}

	public void setPrice(Double price) {
		this.price = price;
	}

	public String getIsSoldOut() {
		return this.isSoldOut;
	}

	public void setIsSoldOut(String isSoldOut) {
		this.isSoldOut = isSoldOut;
	}

	public String getImage() {
		return this.image;
	}

	public void setImage(String image) {
		this.image = image;
	}

	public Set getComments() {
		return this.comments;
	}

	public void setComments(Set comments) {
		this.comments = comments;
	}

}
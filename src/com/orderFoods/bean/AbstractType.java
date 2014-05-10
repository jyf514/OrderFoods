package com.orderFoods.bean;

import java.util.HashSet;
import java.util.Set;

/**
 * AbstractType entity provides the base persistence definition of the Type
 * entity. @author MyEclipse Persistence Tools
 */

public abstract class AbstractType implements java.io.Serializable {

	// Fields

	private Integer typeId;
	private String type;
	private Set restaurants = new HashSet(0);

	// Constructors

	/** default constructor */
	public AbstractType() {
	}

	/** minimal constructor */
	public AbstractType(String type) {
		this.type = type;
	}

	/** full constructor */
	public AbstractType(String type, Set restaurants) {
		this.type = type;
		this.restaurants = restaurants;
	}

	// Property accessors

	public Integer getTypeId() {
		return this.typeId;
	}

	public void setTypeId(Integer typeId) {
		this.typeId = typeId;
	}

	public String getType() {
		return this.type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public Set getRestaurants() {
		return this.restaurants;
	}

	public void setRestaurants(Set restaurants) {
		this.restaurants = restaurants;
	}

}
package com.orderFoods.bean;

import java.util.Set;

/**
 * Type entity. @author MyEclipse Persistence Tools
 */
public class Type extends AbstractType implements java.io.Serializable {

	// Constructors

	/** default constructor */
	public Type() {
	}

	/** minimal constructor */
	public Type(String type) {
		super(type);
	}

	/** full constructor */
	public Type(String type, Set restaurants) {
		super(type, restaurants);
	}

}

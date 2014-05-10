package com.orderFoods.bean;

import java.util.Set;

/**
 * Customer entity. @author MyEclipse Persistence Tools
 */
public class Customer extends AbstractCustomer implements java.io.Serializable {

	// Constructors

	/** default constructor */
	public Customer() {
	}

	/** minimal constructor */
	public Customer(String username, String password, String email) {
		super(username, password, email);
	}

	/** full constructor */
	public Customer(String username, String password, String email,
			Set useraddresses, Set comments) {
		super(username, password, email, useraddresses, comments);
	}

}

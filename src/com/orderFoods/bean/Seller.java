package com.orderFoods.bean;

import java.util.Set;

/**
 * Seller entity. @author MyEclipse Persistence Tools
 */
public class Seller extends AbstractSeller implements java.io.Serializable {

	// Constructors

	/** default constructor */
	public Seller() {
	}

	/** minimal constructor */
	public Seller(String loginName, String password, String realName,
			String id, String phoneNumber, String address, String isPass) {
		super(loginName, password, realName, id, phoneNumber, address, isPass);
	}

	/** full constructor */
	public Seller(String loginName, String password, String realName,
			String id, String phoneNumber, String address, String isPass,
			Set restaurants) {
		super(loginName, password, realName, id, phoneNumber, address, isPass,
				restaurants);
	}

}

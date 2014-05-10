package com.orderFoods.bean;

import java.util.HashSet;
import java.util.Set;

/**
 * AbstractSeller entity provides the base persistence definition of the Seller
 * entity. @author MyEclipse Persistence Tools
 */

public abstract class AbstractSeller implements java.io.Serializable {

	// Fields

	private Integer sellerId;
	private String loginName;
	private String password;
	private String realName;
	private String id;
	private String phoneNumber;
	private String address;
	private String isPass;
	private Set restaurants = new HashSet(0);

	// Constructors

	/** default constructor */
	public AbstractSeller() {
	}

	/** minimal constructor */
	public AbstractSeller(String loginName, String password, String realName,
			String id, String phoneNumber, String address, String isPass) {
		this.loginName = loginName;
		this.password = password;
		this.realName = realName;
		this.id = id;
		this.phoneNumber = phoneNumber;
		this.address = address;
		this.isPass = isPass;
	}

	/** full constructor */
	public AbstractSeller(String loginName, String password, String realName,
			String id, String phoneNumber, String address, String isPass,
			Set restaurants) {
		this.loginName = loginName;
		this.password = password;
		this.realName = realName;
		this.id = id;
		this.phoneNumber = phoneNumber;
		this.address = address;
		this.isPass = isPass;
		this.restaurants = restaurants;
	}

	// Property accessors

	public Integer getSellerId() {
		return this.sellerId;
	}

	public void setSellerId(Integer sellerId) {
		this.sellerId = sellerId;
	}

	public String getLoginName() {
		return this.loginName;
	}

	public void setLoginName(String loginName) {
		this.loginName = loginName;
	}

	public String getPassword() {
		return this.password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getRealName() {
		return this.realName;
	}

	public void setRealName(String realName) {
		this.realName = realName;
	}

	public String getId() {
		return this.id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getPhoneNumber() {
		return this.phoneNumber;
	}

	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}

	public String getAddress() {
		return this.address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getIsPass() {
		return this.isPass;
	}

	public void setIsPass(String isPass) {
		this.isPass = isPass;
	}

	public Set getRestaurants() {
		return this.restaurants;
	}

	public void setRestaurants(Set restaurants) {
		this.restaurants = restaurants;
	}

}
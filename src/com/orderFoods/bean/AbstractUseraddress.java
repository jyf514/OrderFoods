package com.orderFoods.bean;

/**
 * AbstractUseraddress entity provides the base persistence definition of the
 * Useraddress entity. @author MyEclipse Persistence Tools
 */

public abstract class AbstractUseraddress implements java.io.Serializable {

	// Fields

	private Integer userAddressId;
	private Customer customer;
	private String address;
	private String phoneNumber;

	// Constructors

	/** default constructor */
	public AbstractUseraddress() {
	}

	/** full constructor */
	public AbstractUseraddress(Customer customer, String address,
			String phoneNumber) {
		this.customer = customer;
		this.address = address;
		this.phoneNumber = phoneNumber;
	}

	// Property accessors

	public Integer getUserAddressId() {
		return this.userAddressId;
	}

	public void setUserAddressId(Integer userAddressId) {
		this.userAddressId = userAddressId;
	}

	public Customer getCustomer() {
		return this.customer;
	}

	public void setCustomer(Customer customer) {
		this.customer = customer;
	}

	public String getAddress() {
		return this.address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getPhoneNumber() {
		return this.phoneNumber;
	}

	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}

}
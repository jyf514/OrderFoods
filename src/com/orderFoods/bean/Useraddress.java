package com.orderFoods.bean;

/**
 * Useraddress entity. @author MyEclipse Persistence Tools
 */
public class Useraddress extends AbstractUseraddress implements
		java.io.Serializable {

	// Constructors

	/** default constructor */
	public Useraddress() {
	}

	/** full constructor */
	public Useraddress(Customer customer, String address, String phoneNumber) {
		super(customer, address, phoneNumber);
	}

}

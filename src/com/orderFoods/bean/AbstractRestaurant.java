package com.orderFoods.bean;

import java.util.HashSet;
import java.util.Set;

/**
 * AbstractRestaurant entity provides the base persistence definition of the
 * Restaurant entity. @author MyEclipse Persistence Tools
 */

public abstract class AbstractRestaurant implements java.io.Serializable {

	// Fields

	private Integer restaurantId;
	private Type type;
	private Seller seller;
	private Zone zone;
	private String restaurantName;
	private String address;
	private String phoneNumber;
	private String introduction;
	private Integer checkPrice;
	private String businessHour;
	private String isOpen;
	private Set dishs = new HashSet(0);
	private Set orders = new HashSet(0);

	// Constructors

	/** default constructor */
	public AbstractRestaurant() {
	}

	/** minimal constructor */
	public AbstractRestaurant(Type type, Seller seller, Zone zone,
			String restaurantName, String address, String phoneNumber) {
		this.type = type;
		this.seller = seller;
		this.zone = zone;
		this.restaurantName = restaurantName;
		this.address = address;
		this.phoneNumber = phoneNumber;
	}

	/** full constructor */
	public AbstractRestaurant(Type type, Seller seller, Zone zone,
			String restaurantName, String address, String phoneNumber,
			String introduction, Integer checkPrice, String businessHour,
			String isOpen, Set dishs, Set orders) {
		this.type = type;
		this.seller = seller;
		this.zone = zone;
		this.restaurantName = restaurantName;
		this.address = address;
		this.phoneNumber = phoneNumber;
		this.introduction = introduction;
		this.checkPrice = checkPrice;
		this.businessHour = businessHour;
		this.isOpen = isOpen;
		this.dishs = dishs;
		this.orders = orders;
	}

	// Property accessors

	public Integer getRestaurantId() {
		return this.restaurantId;
	}

	public void setRestaurantId(Integer restaurantId) {
		this.restaurantId = restaurantId;
	}

	public Type getType() {
		return this.type;
	}

	public void setType(Type type) {
		this.type = type;
	}

	public Seller getSeller() {
		return this.seller;
	}

	public void setSeller(Seller seller) {
		this.seller = seller;
	}

	public Zone getZone() {
		return this.zone;
	}

	public void setZone(Zone zone) {
		this.zone = zone;
	}

	public String getRestaurantName() {
		return this.restaurantName;
	}

	public void setRestaurantName(String restaurantName) {
		this.restaurantName = restaurantName;
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

	public String getIntroduction() {
		return this.introduction;
	}

	public void setIntroduction(String introduction) {
		this.introduction = introduction;
	}

	public Integer getCheckPrice() {
		return this.checkPrice;
	}

	public void setCheckPrice(Integer checkPrice) {
		this.checkPrice = checkPrice;
	}

	public String getBusinessHour() {
		return this.businessHour;
	}

	public void setBusinessHour(String businessHour) {
		this.businessHour = businessHour;
	}

	public String getIsOpen() {
		return this.isOpen;
	}

	public void setIsOpen(String isOpen) {
		this.isOpen = isOpen;
	}

	public Set getDishs() {
		return this.dishs;
	}

	public void setDishs(Set dishs) {
		this.dishs = dishs;
	}

	public Set getOrders() {
		return this.orders;
	}

	public void setOrders(Set orders) {
		this.orders = orders;
	}

}
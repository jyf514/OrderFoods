package com.orderFoods.bean;

import java.util.HashSet;
import java.util.Set;

/**
 * AbstractZone entity provides the base persistence definition of the Zone
 * entity. @author MyEclipse Persistence Tools
 */

public abstract class AbstractZone implements java.io.Serializable {

	// Fields

	private Integer zoneId;
	private String province;
	private String city;
	private String zone;
	private Set restaurants = new HashSet(0);

	// Constructors

	/** default constructor */
	public AbstractZone() {
	}

	/** minimal constructor */
	public AbstractZone(String province, String city, String zone) {
		this.province = province;
		this.city = city;
		this.zone = zone;
	}

	/** full constructor */
	public AbstractZone(String province, String city, String zone,
			Set restaurants) {
		this.province = province;
		this.city = city;
		this.zone = zone;
		this.restaurants = restaurants;
	}

	// Property accessors

	public Integer getZoneId() {
		return this.zoneId;
	}

	public void setZoneId(Integer zoneId) {
		this.zoneId = zoneId;
	}

	public String getProvince() {
		return this.province;
	}

	public void setProvince(String province) {
		this.province = province;
	}

	public String getCity() {
		return this.city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getZone() {
		return this.zone;
	}

	public void setZone(String zone) {
		this.zone = zone;
	}

	public Set getRestaurants() {
		return this.restaurants;
	}

	public void setRestaurants(Set restaurants) {
		this.restaurants = restaurants;
	}

}
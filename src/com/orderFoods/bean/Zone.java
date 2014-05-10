package com.orderFoods.bean;

import java.util.Set;

/**
 * Zone entity. @author MyEclipse Persistence Tools
 */
public class Zone extends AbstractZone implements java.io.Serializable {

	// Constructors

	/** default constructor */
	public Zone() {
	}

	/** minimal constructor */
	public Zone(String province, String city, String zone) {
		super(province, city, zone);
	}

	/** full constructor */
	public Zone(String province, String city, String zone, Set restaurants) {
		super(province, city, zone, restaurants);
	}

}

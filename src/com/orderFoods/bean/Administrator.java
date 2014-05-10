package com.orderFoods.bean;

/**
 * Administrator entity. @author MyEclipse Persistence Tools
 */
public class Administrator extends AbstractAdministrator implements
		java.io.Serializable {

	// Constructors

	/** default constructor */
	public Administrator() {
	}

	/** full constructor */
	public Administrator(String loginName, String password) {
		super(loginName, password);
	}

}

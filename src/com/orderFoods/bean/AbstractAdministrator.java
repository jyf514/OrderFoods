package com.orderFoods.bean;

/**
 * AbstractAdministrator entity provides the base persistence definition of the
 * Administrator entity. @author MyEclipse Persistence Tools
 */

public abstract class AbstractAdministrator implements java.io.Serializable {

	// Fields

	private Integer administratorId;
	private String loginName;
	private String password;

	// Constructors

	/** default constructor */
	public AbstractAdministrator() {
	}

	/** full constructor */
	public AbstractAdministrator(String loginName, String password) {
		this.loginName = loginName;
		this.password = password;
	}

	// Property accessors

	public Integer getAdministratorId() {
		return this.administratorId;
	}

	public void setAdministratorId(Integer administratorId) {
		this.administratorId = administratorId;
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

}
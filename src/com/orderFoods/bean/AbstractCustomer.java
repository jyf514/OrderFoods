package com.orderFoods.bean;

import java.util.HashSet;
import java.util.Set;

/**
 * AbstractCustomer entity provides the base persistence definition of the
 * Customer entity. @author MyEclipse Persistence Tools
 */

public abstract class AbstractCustomer implements java.io.Serializable {

	// Fields

	private Integer userid;
	private String username;
	private String password;
	private String email;
	private Set useraddresses = new HashSet(0);
	private Set comments = new HashSet(0);

	// Constructors

	/** default constructor */
	public AbstractCustomer() {
	}

	/** minimal constructor */
	public AbstractCustomer(String username, String password, String email) {
		this.username = username;
		this.password = password;
		this.email = email;
	}

	/** full constructor */
	public AbstractCustomer(String username, String password, String email,
			Set useraddresses, Set comments) {
		this.username = username;
		this.password = password;
		this.email = email;
		this.useraddresses = useraddresses;
		this.comments = comments;
	}

	// Property accessors

	public Integer getUserid() {
		return this.userid;
	}

	public void setUserid(Integer userid) {
		this.userid = userid;
	}

	public String getUsername() {
		return this.username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getPassword() {
		return this.password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getEmail() {
		return this.email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public Set getUseraddresses() {
		return this.useraddresses;
	}

	public void setUseraddresses(Set useraddresses) {
		this.useraddresses = useraddresses;
	}

	public Set getComments() {
		return this.comments;
	}

	public void setComments(Set comments) {
		this.comments = comments;
	}

}
package com.orderFoods.bean;

import java.util.Date;

/**
 * AbstractComment entity provides the base persistence definition of the
 * Comment entity. @author MyEclipse Persistence Tools
 */

public abstract class AbstractComment implements java.io.Serializable {

	// Fields

	private Integer commentId;
	private Dish dish;
	private Customer customer;
	private String comment;
	private Date date;
	private Integer grade;

	// Constructors

	/** default constructor */
	public AbstractComment() {
	}

	/** minimal constructor */
	public AbstractComment(Dish dish, Customer customer, Date date,
			Integer grade) {
		this.dish = dish;
		this.customer = customer;
		this.date = date;
		this.grade = grade;
	}

	/** full constructor */
	public AbstractComment(Dish dish, Customer customer, String comment,
			Date date, Integer grade) {
		this.dish = dish;
		this.customer = customer;
		this.comment = comment;
		this.date = date;
		this.grade = grade;
	}

	// Property accessors

	public Integer getCommentId() {
		return this.commentId;
	}

	public void setCommentId(Integer commentId) {
		this.commentId = commentId;
	}

	public Dish getDish() {
		return this.dish;
	}

	public void setDish(Dish dish) {
		this.dish = dish;
	}

	public Customer getCustomer() {
		return this.customer;
	}

	public void setCustomer(Customer customer) {
		this.customer = customer;
	}

	public String getComment() {
		return this.comment;
	}

	public void setComment(String comment) {
		this.comment = comment;
	}

	public Date getDate() {
		return this.date;
	}

	public void setDate(Date date) {
		this.date = date;
	}

	public Integer getGrade() {
		return this.grade;
	}

	public void setGrade(Integer grade) {
		this.grade = grade;
	}

}
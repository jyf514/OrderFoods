package com.orderFoods.action.customer;

import com.opensymphony.xwork2.ActionSupport;
import com.orderFoods.Impl.CustomerServiceImpl;
import com.orderFoods.service.CustomerService;

public class AddCartAction extends ActionSupport {
	private int dishId;
	
	public int getDishId() {
		return dishId;
	}

	public void setDishId(int dishId) {
		this.dishId = dishId;
	}

	public String execute() {
		CustomerService customerService=new CustomerServiceImpl();
		if (!customerService.haveCart()) {
			customerService.initialiseCart();
		}
		if(!customerService.addToCart(dishId)){
			return ERROR;
		}
		return SUCCESS;
	}
}
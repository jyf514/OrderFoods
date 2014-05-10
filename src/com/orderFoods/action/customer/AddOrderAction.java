package com.orderFoods.action.customer;

import com.opensymphony.xwork2.ActionSupport;
import com.orderFoods.Impl.CustomerServiceImpl;
import com.orderFoods.bean.Cart;
import com.orderFoods.service.CustomerService;

public class AddOrderAction extends ActionSupport {

	/**
	 * @return
	 */
	public String execute() {
		// TODO Auto-generated method stub
		CustomerService customerService=new CustomerServiceImpl();
		if(!customerService.haveCart()){
			customerService.initialiseCart();
			return "empty";
		}
		Cart cart=customerService.getCart();
		if (cart.getCart().isEmpty()) {
			return "empty";
		}
		if (!customerService.addOrder(cart)) {
			return ERROR;
		}
		return SUCCESS;
	}
}
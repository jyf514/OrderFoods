package com.orderFoods.action.customer;

import com.opensymphony.xwork2.ActionSupport;
import com.orderFoods.Impl.CustomerServiceImpl;
import com.orderFoods.service.CustomerService;

public class LogoutAction extends ActionSupport {

	/**
	 * @return
	 */
	public String execute() {
		CustomerService customerService=new CustomerServiceImpl();
		customerService.logout();
		return SUCCESS;
	}
}
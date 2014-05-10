package com.orderFoods.action.customer;

import com.opensymphony.xwork2.ActionSupport;
import com.orderFoods.Impl.CustomerServiceImpl;
import com.orderFoods.service.CustomerService;

public class LoginAction extends ActionSupport {

	private String username;
	private String password;
	
	
	public String getUsername() {
		return username;
	}


	public void setUsername(String username) {
		this.username = username;
	}


	public String getPassword() {
		return password;
	}


	public void setPassword(String password) {
		this.password = password;
	}


	public String execute() {
		CustomerService customerService=new CustomerServiceImpl();
		if(!customerService.login(username, password)){
			return "loginFail";
		}
		customerService.initialiseCart();
		return SUCCESS;
	}
}
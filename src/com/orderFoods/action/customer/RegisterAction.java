package com.orderFoods.action.customer;

import com.opensymphony.xwork2.ActionSupport;
import com.orderFoods.Impl.CustomerServiceImpl;
import com.orderFoods.service.CustomerService;

public class RegisterAction extends ActionSupport {
	private String userName;
	private String password;
	private String email;
	private String errorString;
	
	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getErrorString() {
		return errorString;
	}

	public void setErrorString(String errorString) {
		this.errorString = errorString;
	}

	public String execute() {
		CustomerService customerService=new CustomerServiceImpl();
		this.errorString=customerService.registerCheck(userName, password, email);
		if(!this.errorString.equals("success")){
			return "fail";
		}
		if(!customerService.register(userName, password, email)){
			return ERROR;
		}
		return SUCCESS;
	}
}
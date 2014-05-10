package com.orderFoods.Impl;

import java.util.List;

import org.apache.struts2.ServletActionContext;


import com.orderFoods.DAO.CustomerDAO;
import com.orderFoods.bean.Cart;
import com.orderFoods.bean.Customer;
import com.orderFoods.service.CustomerService;
import com.orderFoods.util.DAOUtil;
import com.orderFoods.util.SessionUtil;

public class CustomerServiceImpl implements CustomerService {

	@Override
	public boolean login(String username, String password) {
		Customer customer=new Customer();
		CustomerDAO dao=(CustomerDAO)DAOUtil.getDAO("CustomerDAO");
		customer.setUsername(username);
		customer.setPassword(password);
		List<Customer> list=dao.findByExample(customer);
		if (list.isEmpty()) {
			return false;
		} else {
			customer=list.get(0);
			SessionUtil.clear();
			SessionUtil.put("customerLogin", customer);
			return true;
		}
	}

	@Override
	public boolean addToCart(int dishId) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean haveCart() {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public Cart getCart() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean addOrder(Cart cart) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public void initialiseCart() {
		// TODO Auto-generated method stub
		return;
	}

	@Override
	public String registerCheck(String userName, String password, String email) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean register(String userName, String password, String email) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public void logout() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public String getIP() {
		// TODO Auto-generated method stub
		String ip=ServletActionContext.getRequest().getRemoteAddr();
		return ip;
	}

	@Override
	public void initialiseUser() {
		// TODO Auto-generated method stub
		
	}

}

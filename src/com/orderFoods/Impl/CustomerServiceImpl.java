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
		/**
		 * 调用haveCart()判断是否存在cart
		 * 	否：调用initialiseCart()初始化一个cart
		 * 是：调用dishDAO通过dishId得到dish实例
		 * 调用getCart()得到cart
		 * 判断cart中是否已经存在该dish
		 * 	是：该dish对应的value++
		 * 否：将该dish加入cart，value为1
		 * 返回true
		 * 
		 * 将代码段包裹在try/catch中，catch到异常返回false
		 */
		return false;
	}

	@Override
	public boolean haveCart() {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public Cart getCart() {
		/**
		 * 判断是否有cart
		 * 	否：初始化cart
		 * 是：拿到cart返回
		 */
		return null;
	}

	@Override
	public boolean addOrder(Cart cart) {
		/**
		 * 检验cart的dish是否为空
		 * 	是：返回false
		 * 否：调用相关DAO保存order和orderDetail
		 * 清空cart(此处直接调用初始化cart即可)
		 * 返回true
		 * 捕获到异常返回false
		 */
		return false;
	}

	@Override
	public void initialiseCart() {
		/**
		 * 获取到user，如果没有则调用initialiseUser（）初始化user
		 * 实例化一个Cart
		 * 将获取到的customer赋给Cart的实例，将其HashMap cart置空
		 * 将实例放在session中，设key为“cart”
		 */
		return;
	}

	@Override
	public String registerCheck(String userName, String password, String email) {
		/**
		 * 校验数据合法性，返回的String是提示信息
		 * 需要校验的条件有：userName的唯一性、长度不小于6，不大于20.password长度同userName。email的格式和长度
		 * 数据无误返回“success”
		 * 数据有误直接返回对应中文提示，如“用户名被占用”
		 */
		return null;
	}

	@Override
	public boolean register(String userName, String password, String email) {
		/**
		 * 调用DAO存入数据库
		 */
		return false;
	}

	@Override
	public void logout() {
		SessionUtil.clear();
	}

	@Override
	public String getIP() {
		// TODO Auto-generated method stub
		String ip=ServletActionContext.getRequest().getRemoteAddr();
		return ip;
	}

	@Override
	public void initialiseUser() {
		/**
		 * 实例化一个Customer，userId为0，userName为当前IP（暂定）其余为空
		 * 将该实例放入session，key为“customerLogin”
		 */
		
	}

}

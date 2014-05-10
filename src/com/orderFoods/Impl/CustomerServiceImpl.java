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
		 * ����haveCart()�ж��Ƿ����cart
		 * 	�񣺵���initialiseCart()��ʼ��һ��cart
		 * �ǣ�����dishDAOͨ��dishId�õ�dishʵ��
		 * ����getCart()�õ�cart
		 * �ж�cart���Ƿ��Ѿ����ڸ�dish
		 * 	�ǣ���dish��Ӧ��value++
		 * �񣺽���dish����cart��valueΪ1
		 * ����true
		 * 
		 * ������ΰ�����try/catch�У�catch���쳣����false
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
		 * �ж��Ƿ���cart
		 * 	�񣺳�ʼ��cart
		 * �ǣ��õ�cart����
		 */
		return null;
	}

	@Override
	public boolean addOrder(Cart cart) {
		/**
		 * ����cart��dish�Ƿ�Ϊ��
		 * 	�ǣ�����false
		 * �񣺵������DAO����order��orderDetail
		 * ���cart(�˴�ֱ�ӵ��ó�ʼ��cart����)
		 * ����true
		 * �����쳣����false
		 */
		return false;
	}

	@Override
	public void initialiseCart() {
		/**
		 * ��ȡ��user�����û�������initialiseUser������ʼ��user
		 * ʵ����һ��Cart
		 * ����ȡ����customer����Cart��ʵ��������HashMap cart�ÿ�
		 * ��ʵ������session�У���keyΪ��cart��
		 */
		return;
	}

	@Override
	public String registerCheck(String userName, String password, String email) {
		/**
		 * У�����ݺϷ��ԣ����ص�String����ʾ��Ϣ
		 * ��ҪУ��������У�userName��Ψһ�ԡ����Ȳ�С��6��������20.password����ͬuserName��email�ĸ�ʽ�ͳ���
		 * �������󷵻ء�success��
		 * ��������ֱ�ӷ��ض�Ӧ������ʾ���硰�û�����ռ�á�
		 */
		return null;
	}

	@Override
	public boolean register(String userName, String password, String email) {
		/**
		 * ����DAO�������ݿ�
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
		 * ʵ����һ��Customer��userIdΪ0��userNameΪ��ǰIP���ݶ�������Ϊ��
		 * ����ʵ������session��keyΪ��customerLogin��
		 */
		
	}

}

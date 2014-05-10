package com.orderFoods.service;

import com.orderFoods.bean.Cart;

public interface CustomerService {
	public boolean login(String username,String password);//登录
	public void initialiseCart();//初始化购物车
	public boolean addToCart(int dishId);//添加菜品到购物车
	public boolean haveCart();//判断是否存在购物车
	public Cart getCart();//获取购物车
	public boolean addOrder(Cart cart);//将购物车添加至订单
	public String registerCheck(String userName,String password,String email);//判断注册信息的合法性，返回信息
	public boolean register(String userName,String password,String email);//注册用户
	public void logout();//注销
	public String getIP();//获得客户端IP
	public void initialiseUser();//初始化用户
}

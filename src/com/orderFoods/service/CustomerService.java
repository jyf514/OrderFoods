package com.orderFoods.service;

import com.orderFoods.bean.Cart;

public interface CustomerService {
	public boolean login(String username,String password);//��¼
	public void initialiseCart();//��ʼ�����ﳵ
	public boolean addToCart(int dishId);//��Ӳ�Ʒ�����ﳵ
	public boolean haveCart();//�ж��Ƿ���ڹ��ﳵ
	public Cart getCart();//��ȡ���ﳵ
	public boolean addOrder(Cart cart);//�����ﳵ���������
	public String registerCheck(String userName,String password,String email);//�ж�ע����Ϣ�ĺϷ��ԣ�������Ϣ
	public boolean register(String userName,String password,String email);//ע���û�
	public void logout();//ע��
	public String getIP();//��ÿͻ���IP
	public void initialiseUser();//��ʼ���û�
}

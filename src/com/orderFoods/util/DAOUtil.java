package com.orderFoods.util;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.opensymphony.xwork2.ActionContext;

public class DAOUtil {
	public static Object getDAO(String DAOName) {
		ApplicationContext context=new ClassPathXmlApplicationContext("spring.xml");
		Object DAO=context.getBean(DAOName);
		return DAO;
	}
}

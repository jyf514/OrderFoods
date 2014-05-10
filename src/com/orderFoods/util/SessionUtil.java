package com.orderFoods.util;

import org.apache.struts2.ServletActionContext;

import com.opensymphony.xwork2.ActionContext;

public class SessionUtil<T> {
	
	public static <T> void put(String name,T ob) {
		ActionContext.getContext().getSession().put(name, ob);
	}
	
	public static Object get(String name) {
		return ActionContext.getContext().getSession().get(name);
	}
	
	public static void clear() {
		ActionContext.getContext().getSession().clear();
	}
}

package com.design.aop;

public class MainTest {
	public static void main(String[] args) {
		//创建代理对象
		JdkProxy proxy = new JdkProxy();
		//创建目标对象
		UserDao userDao = new UserDaoImpl();
		//获取增强后的目标对象
		UserDao userDaoProxy = (UserDao) proxy.createProxy(userDao);
		//执行方法
		userDaoProxy.addUser();
		
	}
}

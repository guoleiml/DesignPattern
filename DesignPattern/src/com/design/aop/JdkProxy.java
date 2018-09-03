package com.design.aop;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

/**
 * JDK代理
 * @author BGL
 * @date 2018年9月3日
 */
public class JdkProxy implements InvocationHandler{
	
	//声明目标类接口
	private UserDao userDao;
	
	public Object createProxy(UserDao userDao) {
		this.userDao = userDao;
		
		//1类加载器
		ClassLoader classLoader = JdkProxy.class.getClassLoader();
		//2.被代理对象实现所有的接口
		@SuppressWarnings("rawtypes")
		Class[] clazz = userDao.getClass().getInterfaces();
		//3.使用代理类进行增强。返回的是代理后的对象。
		return Proxy.newProxyInstance(classLoader, clazz, this);
	}
	
	/**
	 * 所有动态代理类的方法，都会交由invoke方法。
	 * @param proxy 被代理后的对象 
	 * @param method 将要执行的方法
	 * @param args执行方法时需要的参数。 
	 */
	@Override
	public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
		//声明切面
		MyAspect myAspect = new MyAspect();
		//指定位置程序执行前的方法
		myAspect.start();
		//目标类上调用方法
		Object obj = method.invoke(userDao, args);
		//指定位置程序执行后的方法
		myAspect.end();
		
		return obj;
	}

}

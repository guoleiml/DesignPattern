package com.design.aop;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

/**
 * JDK����
 * @author BGL
 * @date 2018��9��3��
 */
public class JdkProxy implements InvocationHandler{
	
	//����Ŀ����ӿ�
	private UserDao userDao;
	
	public Object createProxy(UserDao userDao) {
		this.userDao = userDao;
		
		//1�������
		ClassLoader classLoader = JdkProxy.class.getClassLoader();
		//2.���������ʵ�����еĽӿ�
		@SuppressWarnings("rawtypes")
		Class[] clazz = userDao.getClass().getInterfaces();
		//3.ʹ�ô����������ǿ�����ص��Ǵ����Ķ���
		return Proxy.newProxyInstance(classLoader, clazz, this);
	}
	
	/**
	 * ���ж�̬������ķ��������ύ��invoke������
	 * @param proxy �������Ķ��� 
	 * @param method ��Ҫִ�еķ���
	 * @param argsִ�з���ʱ��Ҫ�Ĳ����� 
	 */
	@Override
	public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
		//��������
		MyAspect myAspect = new MyAspect();
		//ָ��λ�ó���ִ��ǰ�ķ���
		myAspect.start();
		//Ŀ�����ϵ��÷���
		Object obj = method.invoke(userDao, args);
		//ָ��λ�ó���ִ�к�ķ���
		myAspect.end();
		
		return obj;
	}

}

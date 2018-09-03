package com.design.aop;

public class MainTest {
	public static void main(String[] args) {
		//�����������
		JdkProxy proxy = new JdkProxy();
		//����Ŀ�����
		UserDao userDao = new UserDaoImpl();
		//��ȡ��ǿ���Ŀ�����
		UserDao userDaoProxy = (UserDao) proxy.createProxy(userDao);
		//ִ�з���
		userDaoProxy.addUser();
		
	}
}

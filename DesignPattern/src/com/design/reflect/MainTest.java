package com.design.reflect;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;

public class MainTest {
	public static void main(String[] args) {
		User user = new User("zhangsan");
//		init(user);
//		initMethod(user);
		initFields(user);
	}
	
	public static void init(User user) {
		Class<? extends User> cz = user.getClass();
		//��ȡ����
		String className = cz.getName();
		System.out.println(className);
		//��ȡ���еĹ��췽��
		Constructor<?>[] cons = cz.getDeclaredConstructors();
		for(int i = 0; i<cons.length; i++) {
			int mod = cons[i].getModifiers();
			System.out.println(Modifier.toString(mod)+ " " + className);
		}
	}
	
	/**
	 * ��ʼ���ֶ�
	 * @param user
	 */
	public static void initFields(User user) {
		Class<? extends User> clazz = user.getClass();
		Field[] declaredFields = clazz.getDeclaredFields();
		for (int i = 0; i < declaredFields.length; i++) {
			//�ֶ�����
			System.out.println(declaredFields[i].getName());
			//�ֶ�����
			System.out.println(declaredFields[i].getType().getName());
			//�ֶε����η�
			int modifiers = declaredFields[i].getModifiers();
			System.out.println(Modifier.toString(modifiers));
		}
		
	}
	
	/**
	 * ��ʼ������
	 * @param user
	 */
	public static void initMethod(User user) {
		Class<? extends User> clazz = user.getClass();
		String className = clazz.getName();
		Method[] methods = clazz.getDeclaredMethods();
		for(int i = 0; i<methods.length; i++) {
			int mod = methods[i].getModifiers();
			//���ط��������η�
			System.out.println(Modifier.toString(mod)+ " " + className);
			//���ط����ķ�������
			System.out.println(methods[i].getReturnType().getName());
			//������
			System.out.println(methods[i].getName()+ "(");
			//��ӡ�����������б�
			Class<?>[] parameterTypes = methods[i].getParameterTypes();
			for (int j = 0; j < parameterTypes.length; j++) {
				System.out.println(parameterTypes[j].getName());
				if(parameterTypes.length > j+1) {
					System.out.print(",");
				}
			}
			System.out.println(")");
		}
	}
	
}

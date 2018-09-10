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
		//获取类名
		String className = cz.getName();
		System.out.println(className);
		//获取共有的构造方法
		Constructor<?>[] cons = cz.getDeclaredConstructors();
		for(int i = 0; i<cons.length; i++) {
			int mod = cons[i].getModifiers();
			System.out.println(Modifier.toString(mod)+ " " + className);
		}
	}
	
	/**
	 * 初始化字段
	 * @param user
	 */
	public static void initFields(User user) {
		Class<? extends User> clazz = user.getClass();
		Field[] declaredFields = clazz.getDeclaredFields();
		for (int i = 0; i < declaredFields.length; i++) {
			//字段名称
			System.out.println(declaredFields[i].getName());
			//字段类型
			System.out.println(declaredFields[i].getType().getName());
			//字段的修饰符
			int modifiers = declaredFields[i].getModifiers();
			System.out.println(Modifier.toString(modifiers));
		}
		
	}
	
	/**
	 * 初始化方法
	 * @param user
	 */
	public static void initMethod(User user) {
		Class<? extends User> clazz = user.getClass();
		String className = clazz.getName();
		Method[] methods = clazz.getDeclaredMethods();
		for(int i = 0; i<methods.length; i++) {
			int mod = methods[i].getModifiers();
			//返回方法的修饰符
			System.out.println(Modifier.toString(mod)+ " " + className);
			//返回方法的返回类型
			System.out.println(methods[i].getReturnType().getName());
			//方法名
			System.out.println(methods[i].getName()+ "(");
			//打印出方法参数列表
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

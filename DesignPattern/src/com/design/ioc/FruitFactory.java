package com.design.ioc;

public class FruitFactory {
	
	//工厂加载
	public static Fruit getInstance(String className) {
		Fruit f = null;
		try {
			//通过反射返回具体的实现类
			f = (Fruit) Class.forName(className).newInstance();
		} catch (Exception e) {
			e.printStackTrace();
		}
		return f;
	}
	
}

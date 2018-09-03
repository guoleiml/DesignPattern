package com.design.ioc;

public class FruitFactory {
	
	//��������
	public static Fruit getInstance(String className) {
		Fruit f = null;
		try {
			//ͨ�����䷵�ؾ����ʵ����
			f = (Fruit) Class.forName(className).newInstance();
		} catch (Exception e) {
			e.printStackTrace();
		}
		return f;
	}
	
}

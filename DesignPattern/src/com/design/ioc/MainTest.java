package com.design.ioc;

public class MainTest {
	public static void main(String[] args) {
		Fruit f = FruitFactory.getInstance("com.design.ioc.Apple");
		if(null != f) {
			f.eat();
		}
	}
}

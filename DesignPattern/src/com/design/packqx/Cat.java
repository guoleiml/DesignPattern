package com.design.packqx;

public class Cat extends Animal {
//	public static int x = 20;
	
	public int x = 20;
	
	public void test() {
		System.out.println("cat..");
	}

	@Override
	void setName() {
		
		x = 3;
		System.out.println("x == "+x);
	}
	
	public Cat() {
		super();
		num = x;
		System.out.println("x == "+x);
	}
}

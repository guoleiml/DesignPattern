package com.design.packqx;

public abstract class Animal {
	int num = 30;
	
	public void test() {
		System.out.println("animal");
	}
	public Animal() {
		setName();
	}
	
	abstract void setName();
	
}

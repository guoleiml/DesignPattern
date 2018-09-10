package com.design.packqx;

public class Constants {
	static {
		System.out.println("static init");
	}
	{
		System.out.println("default static init");
	}
	public Constants() {
		System.out.println("construction init");
	}
	public static final String value ="constants...value";
}

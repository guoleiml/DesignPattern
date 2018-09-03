package com.design.factory;

/**
 * 实际的产品类Bike
 * @author BGL
 * @date 2018年7月11日
 */
public class Bike implements Car{

	@Override
	public void goToWork() {
		System.out.println("go to work by bike!!");
		
	}
	
}

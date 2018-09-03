package com.design.factory;

/**
 * 实际的产品类Bus
 * @author BGL
 * @date 2018年7月11日
 */
public class Bus implements Car {

	@Override
	public void goToWork() {
		System.out.println("go to work by bus!!");

	}

}

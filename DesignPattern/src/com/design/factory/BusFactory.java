package com.design.factory;

/**
 * 具体的工厂子类，分别为每个具体的产品类创建不同的工厂子类
 * @author BGL
 * @date 2018年7月11日
 */
public class BusFactory implements ICarFactory {

	@Override
	public Car getCar() {
		return new Bus();
	}
}

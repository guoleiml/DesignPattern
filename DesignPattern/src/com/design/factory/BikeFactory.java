package com.design.factory;
/**
 * ����Ĺ������࣬�ֱ�Ϊÿ������Ĳ�Ʒ�ഴ����ͬ�Ĺ�������
 * @author BGL
 * @date 2018��7��11��
 */
public class BikeFactory implements ICarFactory {

	@Override
	public Car getCar() {
		return new Bike();
	}
	
}

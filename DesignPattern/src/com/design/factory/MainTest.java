package com.design.factory;
/**
 * ����ģʽ���ŵ㣺
 *1��һ���������봴��һ������ֻҪ֪�������ƾͿ����ˣ���������϶ȡ�
 *2����չ�Ըߣ����������һ����Ʒ��ֻҪ��չһ��������Ϳ��ԡ�ʹ�ô���ṹ����������
 *3�����β�Ʒ�ľ���ʵ�֣�������ֻ���Ĳ�Ʒ�Ľӿڡ�
 * ����ģʽ��ʹ�ó���
 *1��  һ������ӵ�кܶ����ࡣ
 *2��  ����ĳ������ʱ��Ҫ����������Ĳ�����
 *3��  ϵͳ������Ҫ������չ�����Ѷ���ʵ������������ʵ������ɣ���չ�Ժá�
 * @author BGL
 * @date 2018��7��11��
 */
public class MainTest {
	public static void main(String[] args) {
	 	ICarFactory factory = null;
        // bike
        factory = new BikeFactory();
        Car bike = factory.getCar();
        bike.goToWork();
 
        // bus
//	        factory = new BusFactory();
//	        Car bus = factory.getCar();
//	        bus.gotowork();
	}
}

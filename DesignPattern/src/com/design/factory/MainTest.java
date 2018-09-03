package com.design.factory;
/**
 * 工厂模式的优点：
 *1、一个调用者想创建一个对象，只要知道其名称就可以了，降低了耦合度。
 *2、扩展性高，如果想增加一个产品，只要扩展一个工厂类就可以。使得代码结构更加清晰。
 *3、屏蔽产品的具体实现，调用者只关心产品的接口。
 * 工厂模式的使用场景
 *1，  一个对象拥有很多子类。
 *2，  创建某个对象时需要进行许多额外的操作。
 *3，  系统后期需要经常扩展，它把对象实例化的任务交由实现类完成，扩展性好。
 * @author BGL
 * @date 2018年7月11日
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

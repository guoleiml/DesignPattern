package com.design.singleton;
/**
 * 如果面对高并发的情况，而且采用的是懒汉模式，最好的选择就是双重判断加同步的方式。
 * 单例模式如如使用反射创建的时候会创建新的对象，因此不建议单例的时候使用反射。
 * 单例是不能被继承的。
 * 一个JVM只存在一个实例，分布式和类加载器则会有多个。
 * @author BGL
 * @date 2018年7月11日
 */
public class DoubleLock {
	private static volatile DoubleLock instance = null;
	//私有构造
	private DoubleLock() {}
	//调用者
	public static DoubleLock getInstance() {//方法开放不用排队
		if(instance == null) {//如果对象还没有创建，则抢香人进入堂内排队
			synchronized(DoubleLock.class) {
				if(instance == null) {
					instance = new DoubleLock();//头香创建对象，其他的白排队了
				}
			}
		}
		return instance;
	}
	
	/**
	 * 使用场景
	 * 1，需要频繁实例化然后销毁的对象。

		2，创建对象时耗时过多或者耗资源过多，但又经常用到的对象。
		
		3，资源共享的情况下，避免由于资源操作时导致的性能或损耗等
		
		4，控制资源的情况下，方便资源之间的互相通信。
	 */
	
	//禁止使用以下反射
	/**
	 * Class c = Class.forName(Singleton.class.getName());  
		Constructor ct = c.getDeclaredConstructor();  
		ct.setAccessible(true);  
		Singleton singleton = (Singleton)ct.newInstance();
	 */
}

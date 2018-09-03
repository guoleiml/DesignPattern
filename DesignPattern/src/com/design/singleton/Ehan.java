package com.design.singleton;
/**
 * 1，私有的构造方法
 * 2，指向自己实例的私有静态引用
 * 3，以自己实例为返回值的静态的公有的方法
 * @author BGL
 * @date 2018年7月11日
 */
public class Ehan {
	//在单例被加载的时候就创建对象。只有自己可以创建自己
	private static Ehan ehan = new Ehan();
	//私有构造 私有构造防止别人可以创建，因为类有默认的无参构造
	private Ehan() {}
	//调用者使用
	public static Ehan getInstance() {
		return ehan;
	}
}

package com.design.singleton;
/**
 * 
 * @author BGL
 * @date 2018年7月11日
 */
public class Lhan {
	private static Lhan lhan;
	//私有构造
	private Lhan () {}
	//调用者
	public static synchronized Lhan getInstance() {
		if(null == lhan) {
			lhan = new Lhan();
		}
		return lhan;
	}
}

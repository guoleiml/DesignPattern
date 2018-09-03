package com.design.singleton;
/**
 * 
 * @author BGL
 * @date 2018��7��11��
 */
public class Lhan {
	private static Lhan lhan;
	//˽�й���
	private Lhan () {}
	//������
	public static synchronized Lhan getInstance() {
		if(null == lhan) {
			lhan = new Lhan();
		}
		return lhan;
	}
}

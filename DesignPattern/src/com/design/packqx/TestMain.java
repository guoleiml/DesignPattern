package com.design.packqx;

import org.junit.Test;
/**
 * ���Լ̳й�ϵ�м̳и������Ժͷ���
 * @author BGL
 * @date 2018��8��15��
 */
public class TestMain {
	@Test
	public void testAnimal() {
		Cat animal = new Cat();
//		animal.test();
		System.out.println(animal.num);
	}
	
	@Test
	public void testEnum() {
		Fruits[] values = Fruits.values();
		for(int i=0; i<values.length; i++) {
			System.out.println(values[i]);
		}
	}
	
	@Test
	public void testStaticOrder() {
//		ConstantsNode node = new ConstantsNode();
		System.out.println(ConstantsNode.value);
	}
	
	
	
	
}

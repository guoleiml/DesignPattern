package com.design.singleton;
/**
 * 1��˽�еĹ��췽��
 * 2��ָ���Լ�ʵ����˽�о�̬����
 * 3�����Լ�ʵ��Ϊ����ֵ�ľ�̬�Ĺ��еķ���
 * @author BGL
 * @date 2018��7��11��
 */
public class Ehan {
	//�ڵ��������ص�ʱ��ʹ�������ֻ���Լ����Դ����Լ�
	private static Ehan ehan = new Ehan();
	//˽�й��� ˽�й����ֹ���˿��Դ�������Ϊ����Ĭ�ϵ��޲ι���
	private Ehan() {}
	//������ʹ��
	public static Ehan getInstance() {
		return ehan;
	}
}

package com.design.pack;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.math.BigDecimal;
public class Test {
	public static void main(String[] args) {
		//��ʽ����ת�����Դ�С�����Զ�ת����byte ->short(char)->int->long->float->double������������ᶪʧ���ȣ����������ʾ����ת����
		//����byte,short,char�������Ͷ��ԣ�������ƽ���ģ���˲����໥�Զ�ת��������ʹ��������ǿ������ת���� �磺
		//��ʽת�� byte->short->int->long 
	}
	/**
	 * BigDecimal ������λС��
	 */
	@org.junit.Test
	public void testNum() {
		float a = 1.3435f;
		BigDecimal bd =  new BigDecimal(a);
		double f = bd.setScale(2, BigDecimal.ROUND_HALF_UP).doubleValue();
		System.out.println(f);
	}
	
	/**
	 * ���ֽ���
	 */
	//byte,char,short(������ƽ��)-->int-->float-->long-->double
	@org.junit.Test
	public void testInputstream() {
		FileInputStream fis = null;
		try {
			//1.��ȡ������
			fis = new FileInputStream("E:/1.txt");
			//2.�Ӵ��������п��Զ�ȡ������������ʣ���ֽ����Ĺ���ֵ
			int size = fis.available();
			//3.����һ���ֽ�����
			byte[] arrays = new byte[size];
			//������������������
			fis.read(arrays);
			String str = new String(arrays);
			System.out.println(str);
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally {
			if(fis != null) {
				try {
					fis.close();
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		}
		
	}
	/**
	 * д�ֽ���
	 */
	@org.junit.Test
	public void testOutputStream() {
		//1.��Ҫд����ļ�
		String out = "kkll";
		//2.ת�����ֽ�����
		byte[] arrays = out.getBytes();
		//3.�����ļ������
		FileOutputStream fos = null;
		try {
			fos = new FileOutputStream("E:/2.txt");
			//4.д��
			fos.write(arrays);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	@org.junit.Test
	public void testMaopao() {
		int [] a = {60,50,20,30,40,10};
		maopao(a,a.length);
	}
	
	public void  maopao(int [] m, int n) {
		int i,j;
		int flag;
		//��һ��ѭ������Ԫ�ظ���,���ݼ���n-1��Ϊ���洢Ԫ��
		for(i = n-1; i>0; i--) {
			flag = 0;
			//�ڶ�������Ա�,������ӡ�
			for(j = 0; j<i; j++) {
				if(m[j] > m[j+1]) {
					int temp = m[j];
					m[j] = m[j+1];
					m[j+1] = temp;
					flag = 1;
				}
			}
			
			if(flag == 0) {
				break;
			}
		}
		//ѭ�����
		for(int k = 0; k<m.length; k++) {
			System.out.println(m[k]);
		}
		
	}
	/**
	 * [2,2,3,4,5,6,8,13,17,18]
	*  17  ---8
	 * @param nums
	 * @param target
	 * @return
	 */
	public int binarySearch(int[] nums, int target) {
        // write your code here
        int low  = 0;
        int hight = nums.length - 1;
        int noResult = -1;
        while(low <= hight){
            int num = low+(hight - low)/2;
            if(nums[num] > target){
                hight = num-1;
            }else if(nums[num] < target){
                low = low + 1;
            }else{
                return num;
            }
        }
        return noResult;
    }
	@org.junit.Test
	public void testErfenfa() {
		int [] ar = {2,2,3,4,5,6,8,13,17,18};
		int num = 17;
		System.out.println(binarySearch(ar, num));
		
	}
	
	@org.junit.Test
	public void testStr() {
		String str = "Crs_Infomation";
		String[] array = str.split("_");
		String file = "";
		for(String s : array) {
			String lowerCase = s.toLowerCase();
			char c = (char) (lowerCase.charAt(0) - 32);
			file += c + s.substring(1, s.length());
		}
		
		System.out.println(file);
	}
	
	
	
	
	
	
}

package com.design.pack;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.math.BigDecimal;
public class Test {
	public static void main(String[] args) {
		//隐式类型转换可以从小到大自动转，即byte ->short(char)->int->long->float->double，如果反过来会丢失精度，必须进行显示类型转换。
		//对于byte,short,char三种类型而言，他们是平级的，因此不能相互自动转换，可以使用下述的强制类型转换。 如：
		//隐式转换 byte->short->int->long 
	}
	/**
	 * BigDecimal 保留两位小数
	 */
	@org.junit.Test
	public void testNum() {
		float a = 1.3435f;
		BigDecimal bd =  new BigDecimal(a);
		double f = bd.setScale(2, BigDecimal.ROUND_HALF_UP).doubleValue();
		System.out.println(f);
	}
	
	/**
	 * 读字节流
	 */
	//byte,char,short(这三个平级)-->int-->float-->long-->double
	@org.junit.Test
	public void testInputstream() {
		FileInputStream fis = null;
		try {
			//1.获取输入流
			fis = new FileInputStream("E:/1.txt");
			//2.从此输入流中可以读取（或跳过）的剩余字节数的估计值
			int size = fis.available();
			//3.创建一个字节数组
			byte[] arrays = new byte[size];
			//将此流读到该数组中
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
	 * 写字节流
	 */
	@org.junit.Test
	public void testOutputStream() {
		//1.需要写入的文件
		String out = "kkll";
		//2.转换成字节数组
		byte[] arrays = out.getBytes();
		//3.创建文件输出流
		FileOutputStream fos = null;
		try {
			fos = new FileOutputStream("E:/2.txt");
			//4.写入
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
		//第一层循环的是元素个数,逐层递减，n-1即为最大存储元素
		for(i = n-1; i>0; i--) {
			flag = 0;
			//第二层逐个对比,逐层增加。
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
		//循环输出
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

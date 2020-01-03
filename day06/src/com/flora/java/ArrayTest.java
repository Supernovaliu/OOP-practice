package com.flora.java;

public class ArrayTest {
	public static void main(String[] args) {
		int num;
		num = 10;
		int id = 1001;
		int[]ids ;
		ids = new int[] {1001,1002,1003,1004};//静态初始化:数组的初始化和数组元素的赋值操作同时进行
		
		String[] names = new String[5];//动态初始化：数组的初始化和数组元素的赋值分开进行
		names[0] = "Ming";
		names[1] = "He";
		names[2] = "xueliang";
		names[3] = "julong";
		names[4] = "hongzhi";//charAt(0)
		
		System.out.println(names.length);//如何获得数组的长度
		System.out.println(ids.length);
		
		//如何遍历数组
//		System.out.println(names[0]);
//		System.out.println(names[1]);
//		System.out.println(names[2]);
//		System.out.println(names[3]);
		
		for(int i = 0;i<names.length;i++) {
			System.out.println(names[i]);
		
		}
		char[] arr2 = new char[4];
		for (int i=0;i<arr2.length;i++) {
			System.out.println(arr2);
		}
	}
	

}

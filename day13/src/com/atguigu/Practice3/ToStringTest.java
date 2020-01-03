package com.atguigu.Practice3;
/*
 * 当我们输出一个对象的引用时，实际上就是调用当前对象的toString方法
 * String,Date,File,包装类都重写了toString方法
 * 
 * 
 * */
public class ToStringTest {
	public static void main(String[] args) {
		
		String str = new String("MM");
		System.out.println(str);
	}

}

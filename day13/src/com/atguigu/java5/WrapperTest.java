package com.atguigu.java5;

import org.junit.Test;

/*
 * java提供八种基本数据类型的包装类，使得基本数据类型的变量具有类的特征
 * 掌握基本数据类型，包装类，String三者之间的相互转换
 * 
 * */
public class WrapperTest {
	//可能会报NumberFormatException错误
	@Test
	public void test5() {
		String str1 ="123";
		int num2 = Integer.parseInt(str1);
		System.out.println(num2+1);
		String str2 = "true";
		boolean b1 = Boolean.parseBoolean(str2);
		System.out.println(b1);
	}
	@Test
	public void test4() {
		int num1 = 10;
		String str1 = num1+"";
		float f1 = 12.3f;
   String str2 =String.valueOf(f1);
   Double d1 = new Double(12.4);
   String str3 =String.valueOf(d1);
   System.out.println(str2);
   System.out.println(str3);
	}
	/*
	 * 自动装箱与开箱
	 * */
	@Test
	public void test3() {
		//int num1 = 10;
		//method(num1);
		int num2 = 10;
		Integer in1 = num2;//自动装箱
		int num3 = in1;//自动拆箱
	}
	public void method(Object obj) {
		
	}
	//Wrapper -->primitive data,call xxxValue
	@Test
	public void Test2() {
		Integer in1 = new Integer(12);
		int i1 = in1.intValue();
		System.out.println(i1+1);
		
		Float f1 = new Float(12.3);
		float f2 = f1.floatValue();
		System.out.println(f2+1);
	}
	
	//primitive data type--->Wrapper,call constructor of wrapper
@Test
public void test1() {
	int num1 = 10;
	Integer in1 = new Integer(num1);
	System.out.println(in1.toString());
	Integer in2 = new Integer("123");
	System.out.println(in2.toString());
	
	//Integer in3 = new Integer("123abc");
	//System.out.println(in3.toString());
	
	Float f1 = new Float(12.3);
	Float f2 = new Float("12.3");
	System.out.println(f1);
	System.out.println(f2);
	
	Boolean b1 = new Boolean(true);
	
	Boolean b2 = new Boolean("true123");
	System.out.println(b2);
	
	Order order = new Order();
	System.out.println(order.isMale);
	System.out.println(order.isFemale);
}
}
class Order{
	boolean isMale;
	Boolean isFemale;
}

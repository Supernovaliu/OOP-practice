package com.flora.object;
/*
 * 可变个数形参的方法
 * 
 * 格式：数据类型...变量名
 * 
 * 当调用可变个数形参的方法时，传入参数的个数从0到多个都可以
 * 传入参数的类型不能变
 * 可变个数形参的方法与本类中方法名相同，形参个数不同的方法之间构成重载
 * 可变个数形参的方法与本类中方法名相同,形参类型也相同的数组不能共存
 * 可变个数形参在方法的形参中，必须声明在末尾
 * 可变个数形参在方法的形参中，最多只能声明一个可变形参
 * 
 * 
 * */
public class MethodArgsTest{
 public static void main(String[] args) {
	MethodArgsTest test = new MethodArgsTest();
	test.show(12);
	test.show("hello");
	test.show(new String[6]);
 }
	public void show(int i ) {
		
	}
	public void show(String s) {
		
	}
	public void show(String...strs) {
		for(int i = 0;i<strs.length;i++) {
			System.out.println(strs[i]);
		}
	}
	
}

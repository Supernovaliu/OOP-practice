package com.flora.Exception1;

import org.junit.Test;

/*finally的使用
 * finally是可选的
 * finally中声明的是一定会被执行的代码，即使catch中出现异常或try中和catch中有return语句
 * 像数据库连接，输入输出流，网络编程socket等 资源，我们需要自己手动进行资源释放
 * 资源释放需要放在finally中
 * 
 * */
public class FinallyTest {
	@Test
	public void test2() {
		
	}
	@Test
	public void testMethod(){
		int num = method();
		System.out.println(num);
	}
	public int method() {
		try {
			int[] arr = new int[10];
			System.out.println(arr[10]);
			return 1;
		}catch(ArrayIndexOutOfBoundsException e) {
			e.printStackTrace();
			return 2;
		}finally {
			System.out.println("hahahahhahaha");
			return 3;
		}
	}
	
@Test
public void test1() {
	try{int a = 10;
	int b= 0;
	System.out.println(a/b);
	}catch(ArithmeticException e) {
		int[] arr = new int[10];
		System.out.println(arr[10]);
		
		//e.printStackTrace();
	}catch(Exception e) {
		e.printStackTrace();
	}finally {
		System.out.println("我好帅呀");
	}
}
}

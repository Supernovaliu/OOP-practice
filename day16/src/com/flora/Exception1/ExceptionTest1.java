package com.flora.Exception1;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.junit.Test;



/*异常的处理：抓抛模型
 * 过程一：抛，程序在正常执行的额过程中，一旦出现异常，就会生成一个对应异常类的对象，并将此对象抛出
 *        一旦抛出对象以后，其后的代码就不再执行
 *        异常对象：1.系统自动生成的异常对象
 *                  2.手动生成一个异常对象，并抛出（throw）
 * 
 * 过程二：抓，可以理解为异常的处理方式1.try-catch-finally,2.throws
 * try-catch-finally的使用
 * try{
 * 
 * 可能出现异常的代码
 * }catch（异常类型1 变量名1）{
 * 处理异常的方式1
 * }catch（异常类型2 变量名2）{
 * }.....
 * finally{
 * 
 * 一定会执行的代码
 * }finally是可选的
 * 
 * 使用try将可能出现异常的代码包装起来，在执行过程中一旦出现异常就会生成一个对应异常类的对象
 * 根据此对象的类型，去catch中进行匹配
 * 一旦匹配到某个catch时，就会进行对应的异常处理，一旦处理完成就跳出try catch结构（在没有写finally的情况下）
 * 继续执行其后的代码
 * 常用的异常对象处理方式，1.String getMessage() 2.printStackTrace()
 * try大括号里声明的变量，出了try结构以后就不能再被调用
 * 使用try-catch-finally处理编译时异常，但运行时仍可能报错
 * 相当于使编译时可能出现的异常延迟到运行时出现
 * try-catch-finally结构可以嵌套
 * 开发中，由于运行时异常比较常见，就不针对运行时异常编写try-catch
 * 在编译时异常用
 * */
public class ExceptionTest1 {
	@Test
	public void test2() {
		FileInputStream fis = null;
		try {
		File file = new File("hello.txt");
		FileInputStream fis1 = new FileInputStream(file);
		
		int data = fis1.read();
		while(data!=-1) {
			System.out.println((char)data);
			data = fis1.read();
		}
		fis1.close();
		}catch(FileNotFoundException e) {
			e.printStackTrace();
		}catch(IOException e) {
			e.printStackTrace();
		}
	}
  @Test
 public void test1() {
	  String str = "123";
	  str = "abc";
	  int num = 0;
	 try { 
	   num = Integer.parseInt(str);
	  System.out.println("Hello");
	 }catch(NumberFormatException e) {
		 System.out.println("出现数值转换异常，不要着急");
		 System.out.println(e.getMessage());
		 e.printStackTrace();
	 }catch(NullPointerException e) {
		 System.out.println("Hello3");
	 }catch(Exception e) {
		 System.out.println("出现异常了，不要着急");
	 }
	 System.out.println("Hello2");
  }
}

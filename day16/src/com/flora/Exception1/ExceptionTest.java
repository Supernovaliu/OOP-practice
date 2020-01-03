package com.flora.Exception1;

import java.util.Date;
import java.util.Scanner;

import org.junit.Test;

/*
 * java.lang.Throwable
 * java.lang.Error
 * java.lang.Exception(编译时异常checked和运行时异常unchecked)
 * 编译时异常：IOException,FileFoundException,ClassNotFoundException
 * 运行时异常：NullPointerException,ArrayIndexOutOfBoundsException
 *            ClassCastException,NumberFormatException
 *            InputMismatchException,ArithmeticException
 * 
 * 
 * 
 * 
 * 
 * */
public class ExceptionTest {
	//ArithmeticException
	@Test
	public void test6() {
		//例如，除数为0的情况
	}
	//InputMismatchException
	@Test
	public void test5() {
		Scanner scan  = new Scanner(System.in);
		int score  = scan.nextInt();
		System.out.println(score);
	}
	//NumberFormatException
	@Test
	public void test4() {
		String str = "123";
		str = "abc";
		int num = Integer.parseInt(str);
	}
	//ClassCastException
	@Test
	public void test3() {
		Object obj = new Date();
		String str = (String)obj;
	}
	
	//ArrayIndexOutOfBoundsException
	@Test
	public void test2() {
		int[] arr = new int[10];
		System.out.println(arr[10]);
	}
//NullPointerException
	@Test
	public void test1() {
		int[] arr = null;
		System.out.println(arr[3]);
		String str = "abc";
		str = null;
		System.out.println(str.charAt(0));
	}
	
}

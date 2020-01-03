package com.flora.Exception1;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

/*throws+异常类型
 * 写在方法的声明处，指明此方法执行时，可能抛出的异常类型
 * 一旦当方法体执行时，，出现异常，仍会在异常代码处生成一个异常类的对象，此对象满足throws异常类型时就会被抛出
 * 异常代码后续的代码就不再执行
 * try-catch-finally真正的将异常处理掉了
 * throws方式只是将异常抛给了方法的调用者，并没有真正将异常处理掉
 * 
 * 开发中，如何选择try-catch-finally和throws
 * 如果父类中被重写的方法没有throws方式处理异常，则子类重写的方法也不能throws
 * 只能用try-catch-finally方式处理
 * 执行的方法中，先后又调用了另外的方法，这几个方法是递进关系执行的，建议这几个方法进行throws处理，
 * 而执行的方法A可以考虑用try-catch-finally方式进行处理
 * 
 * 
 * */
public class ExceptionTest2 {
	public static void main(String[] args)throws IOException {
		try {
		method2();
		}catch(FileNotFoundException e) {
			e.printStackTrace();
		}catch(IOException e) {
			e.printStackTrace();
		}
		//method3();
	}
	public static void method3() {
		try {
			method2();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	public static void method2() throws  IOException{
		method1();
	}
	public static void method1() throws FileNotFoundException,IOException {
		
		File file = new File("hello.txt");
		FileInputStream fis = new FileInputStream(file);
		
		int data = fis.read();
		while(data!=-1) {
			System.out.println((char)data);
			data = fis.read();
		}
		fis.close();
	}
}

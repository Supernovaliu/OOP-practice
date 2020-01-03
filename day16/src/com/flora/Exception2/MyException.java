package com.flora.Exception2;
/*如何自定义异常类
 * 继承于现有的异常结构，RuntimeException，Exception
 * 提供全局常量serialVersionUID
 * 
 * 
 * 
 * */
public class MyException extends RuntimeException{
static final long serialVersionUID = -7034897190745766939L;
public MyException() {
	
}
public MyException(String msg) {
	super(msg);
}
}

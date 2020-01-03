package com.flora.java2;
/*
 * 
 * 
 * 
 * */
public class SingletonTest {
   public static void main(String[] args) {
	Bank bank1 = Bank.getInstance();
	Bank bank2 = Bank.getInstance();
}
}
//饿汉式：线程安全的
class Bank{
	//1.私有化类的构造器
	private Bank() {
		
	}
	private static Bank instance = new Bank();
	//提供公共的静态方法返回类的对象，此对象也必须声明为静态的
	public static Bank getInstance() {
		return instance;
	}
}
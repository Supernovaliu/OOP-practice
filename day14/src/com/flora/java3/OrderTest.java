package com.flora.java3;
/*
 * 1.默认初始化
 * 2.显式初始化,5.在代码块中赋值
 * 3.构造器中初始化
 * 4.对象调用赋值
 * 执行的先后顺序：1-2/5-3-4
 * */
public class OrderTest {
public static void main(String[] args) {
	Order order = new Order();
	System.out.println(order.orderId);
}
}
class Order{
	int orderId = 3;
	{
		orderId = 4;
	}
}
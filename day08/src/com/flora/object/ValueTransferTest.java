package com.flora.object;
/*
 * 关于变量的赋值
 * 如果变量是基本数据类型，此时赋值的是变量所保存的数据值
 * 如果变量是引用数据类型，此时赋值的是变量所保存的地址值
 * 
 * 
 * 
 * 
 * */
public class ValueTransferTest {
public static void main(String[] args) {
	int m =10;
	int n = m;
	System.out.println(m+""+n);
	n = 20;
	System.out.println(m+""+n);
	System.out.println("***********************************");
	Order o1 = new Order();
	o1.orderId = 1001;
	Order o2 = o1;//赋值以后，o1和o2的地址值相同
	System.out.println(o1.orderId+""+o2.orderId);
	o2.orderId = 1002;
	System.out.println(o1.orderId+""+o2.orderId);
}
}
class Order{
	int orderId;
}

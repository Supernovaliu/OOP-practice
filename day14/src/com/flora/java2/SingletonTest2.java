package com.flora.java2;
//懒汉式:延迟对象的创建。目前的写法坏处，不安全
public class SingletonTest2 {
  Order order1 = Order.getInstance();
  Order order2 = Order.getInstance();
}


class Order{
	private Order() {
		
	}
	private static Order instance = null;
	
	public static Order getInstance() {
		if(instance == null) {
			instance = new Order();
		}
		return instance;
	}
}

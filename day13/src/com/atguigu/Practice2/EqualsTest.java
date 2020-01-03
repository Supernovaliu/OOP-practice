package com.atguigu.Practice2;
//==和equals的区别
/*
 * ==运算符，可以使用在基本数据类型变量和引用数据类型变量中
 * 如果比较的是基本数据类型变量，比较两个变量保存的数据是否相等
 * 如果比较的是引用数据类型变量，比较两个对象的地址值是否相等，即两个引用是否指向同一个对象实体
 * equals方法
 * 是一个方法
 * 只能适用于引用数据类型
 * object类中equals的定义：
 *   public boolean equals(Object obj){
 *       return (this == obj);
 *   }
 * object类中定义的equals方法和==是相同的
 * 像STRING,DATE,FILE,包装类等都重写了object类中的equals方法，比较的不是地址而是内容
 * 自定义类如果使用equals，通常需要重写
 * */
public class EqualsTest {
  public static void main(String[] args) {
	int i = 10;
	int j = 10;
	double d = 10.0;
	System.out.println(i == j);
	System.out.println(i == d);
	
	boolean b = true;
	
	char c = 10;
	System.out.println(i == c);
	
	char c1 = 'A';
	char c2 = 65;
	System.out.println(c1 == c2);
	
}/*
  public boolean equals(Object obj) {
	  if(this == obj) {
		  return true;
	  }
	  if(obj instanceof Customer) {
		  Customer cust = (Customer)obj;
		  if(this.age == cust.age&&this.name.equals(cust.name)) {
			  return true;
		  }else {
			  return false;
		  }
		  return false;
	  }
  }*/
}

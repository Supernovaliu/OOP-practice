package com.flora.java;
/*
 * static可以用来修饰属性，方法，代码块，内部类
 * 使用static修饰的属性：静态变量
 * 静态属性和非静态属性（实例变量）
 * 静态变量：多个对象共享同一个静态变量
 * 静态变量随着类的加载而加载，可以通过“类.静态变量”的方法调用
 * 静态变量的加载要早于对象的创建
 * 由于类只会加载一次，则静态变量在内存中也只会存在一份，存在方法区的静态域中
 * 
 *        类变量             实例变量
 * 类            yes            no
 * 对象       yes             yes
 * 静态属性举例：System.out;Math.PI
 * 静态方法
 * 随着类的加载而加载，可以使用“类.静态方法”的方式来调用
 * 静态方法中只能调用静态的方法或属性
 * 非静态方法中既可以调用静态方法和属性也可以调用非静态方法和属性
 * 
 * 在静态方法内，不可以使用this和super关键字
 * 开发中，如何确定一个属性是否要声明为static？
 *    类中的常量也常常声明成static的
 *    属性是可以被多个对象所共享的，不会随着对象的不同而不同的
 *    开发中，如何确定一个方法是否要声明为static的
 *    操作静态属性的方法通常都声明为静态的
 *    工具类中的方法，习惯上声明为static的，比如math,array,collections
 * */
public class StaticTest {
public static void main(String[] args) {
	Chinese c1 = new Chinese();
	c1.name = "yaoming";
	c1.age = 40;
	
	Chinese c2 = new Chinese();
	c2.name = "malong";
	c2.age = 30;
	
	c1.nation = "CHN";
	System.out.println(c2.nation);
	
}
}

class Chinese{
	String name;
	int age;
	static String nation;
	
}

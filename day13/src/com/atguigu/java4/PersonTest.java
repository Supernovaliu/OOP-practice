package com.atguigu.java4;
//polymorphism
//一个事物的多种形态
//对象的多态性，父类的引用指向子类的对象
//多态的使用：在编译期，只能调用父类中声明的方法，但在运行时，执行的是子类重写父类的方法
//多态性的使用前提：类的继承关系，方法的重写
//对象的多态性只适用于方法，不适用于属性
public class PersonTest {
public static void main(String[] args) {
	Person p1 = new Person();
	p1.eat();
	
	Man man = new Man();
	man.eat();
	man.age = 25;
	man.earnMoney();
	
	
	Person p2 = new Man();
	//Person p3 = new Woman();
	p2.eat();
	p2.walk();//实际执行的是子类重写父类的方法
	//p2.earnMoney();
	System.out.println(p2.id);
	//不能调用子类所特有的方法和属性
	//如何调用子类中特有的属性和方法呢？强制转换符（向下转型）
	Man m1 = (Man)p2;
	m1.earnMoney();
	m1.isSmoking = true;
	//强转可能出现异常
	//instanceof
	//a instanceof A:判断对象a是否是类A的实例。如果是，返回true，如果不是，返回false
	if(p2 instanceof Woman) {
		Woman w1 = (Woman)p2;
		w1.goShopping();
		System.out.println("Woman");
		//为了向下转型不出现异常，在强转之前先用instanceof进行判断，一旦返回true就进行向下转型，否则不进行向下转型
		//若 a instanceof A为true， a instanceof B也为true,则B是A的父类
	}
	//question1 compile successfully but running failed
	//Person p3 = new Woman();
	//Man m3 = (Man)p3;
	
	Object obj = new Woman();
	Person p = (Person)obj;
	
	//Man m5 = new Woman();
}
}

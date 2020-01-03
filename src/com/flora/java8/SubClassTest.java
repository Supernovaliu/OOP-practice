package com.flora.java8;

public class SubClassTest {
public static void main(String[] args) {
	SubClass s = new SubClass();
	//接口中定义的静态方法只能通过接口来调用
	CompareA.method1();
	s.method2();
	//通过实现类的对象，可以调用接口中的默认方法,如果该默认方法被重写了，那么调用的是重写之后的方法
	s.method3();//如果子类（或实现类）继承的父类和实现的接口中声明了同名同参数的方法，那么子类在没有重写此方法的情况下默认调用父类中的方法（类优先原则）
	//如果实现类实现了多个接口，而这多个接口中定义类同名同参数的默认方法，那么在实现类妹有重写的情况下会报错，此报错为接口冲突
	//必须在实现类
}
}
class SubClass extends SuperClass implements CompareA,CompareB{
	public void method2() {
		System.out.println("subclass:shanghai");
	}

	public void method3() {
		System.out.println("Subclass:shenzhen");
	}
	public void myMethod() {
		method3();
		super.method3();
		//调用接口中的默认方法
		CompareA.super.method3();
		CompareB.super.method3();
	}

	
	
}
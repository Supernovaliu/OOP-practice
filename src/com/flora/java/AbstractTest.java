package com.flora.java;
/*
 * abstract关键字的使用
 * abstract可以用来修饰类和方法
 * abstract 修饰方法
 * 抽象类中一定有构造器，便于子类实例化后调用
 * 抽象方法只有方法的声明没有方法体
 * 包涵抽象方法的类一定是个抽象类，反之，抽象类中是可以没有抽象方法的
 * 若子类重写了父类中的所有的抽象方法后，此子类方可实例化
 * 若此子类没有重写父类中的所有的抽象方法，则此子类必须也是一个抽象类
 * */
public class AbstractTest {
public static void main(String[] args) {
	//一旦类抽象了就不可实例化
	//Person p1 = new Person();
	//p1.eat();
}
}
abstract class Person{
	String name;
	int age;
	public Person() {
		
	}
	
	public Person(String name, int age) {
		super();
		this.name = name;
		this.age = age;
	}

	public void eat() {
		System.out.println("eating");
	}
	public abstract void enjoy();
	public void walk() {
		System.out.println("walking");
	}
}

class Student extends Person{
	public Student() {
		super();
	}
	public Student(String name,int age) {
		super(name,age);
	}

	@Override
	public void enjoy() {
		System.out.println("eating more");
		
	}
}
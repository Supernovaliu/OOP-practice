package com.flora.java3;
//类的成员之四，代码块
//代码块的作用：用来初始化类或者对象
//代码块如果有修饰的话，只能用static
//静态代码块和非静态代码块
//代码块内部可以有输出语句
//静态代码块随着类的加载而执行，只会执行一次
//非静态代码块随着对象的创建而执行
//每创建一个对象，非静态代码块都会执行一次
//非静态代码块的作用：可以在创建对象时，对对象的属性进行初始化
//属性赋值：默认初始化，显式初始化，构造器中初始化，对象调用初始化，代码块中赋值
//静态代码块作用：初始化类的信息
//如果一个类中定义了多个静态代码块，按定义的顺序执行
//静态代码块的执行优先于非静态代码块的执行
//静态代码块内只能调用静态的属性和方法
public class BlockTest {
  public static void main(String[] args) {
	String desc = Person.desc;
	Person p1 = new Person();
	Person p2 = new Person();
	Person.info();
}
}

class Person{
	String name;
	int age;
	static String desc = "I am a man";
	public Person() {
		
	}
	public Person(String name,int age) {
		this.name = name;
		this.age = age;
	}
	//代码块
	static{
	System.out.println("hello,static block");
		
		
	}
	{
		System.out.println("hello,block");
	}
	public void eat() {
		System.out.println("吃饭");
	}
	@Override
	public String toString() {
		return "Person [name=" + name + ", age=" + age + "]";
	}
	public static void info() {
		System.out.println("I am a happy snowman");
	}
}
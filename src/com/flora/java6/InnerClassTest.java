package com.flora.java6;
/*
 * 内部类
 * Java中允许将一个类声明在另一个类中
 * 内部类的分类：成员内部类和局部内部类
 * 成员内部类：
 * 一方面，作为外部类的成员：可以调用外部类的结构，可以被static修饰
 *                          可以被四种不同的权限修饰
 * 另一方面，作为一个类：类内可以定义属性，方法，构造器等,可以被final修饰
 *                      
 * 关注如下的3个问题，：如何实例化成员内部类的对象
 *                     如何在成员内部类中区分调用外部类的结构
 *                     开发中的使用
 * 
 * 
 * 
 * */
public class InnerClassTest {
public static void main(String[] args) {
	Person.Dog dog = new Person.Dog(); 
	dog.show();
	Person p = new Person();
	Person.Bird bird = p.new Bird();
	bird.Sing();
	bird.display("huangli");
}
}

class Person{
	String name = "xiaoming";
	int age;
	public void eat() {
		System.out.println("eating");
	}
	static class Dog{
		String name; 
		int age;
		public void show() {
			System.out.println("kala is a dog");
			//eat();
		}
	}
final class Bird{
		String name = "dujuan";
		public Bird() {
			
		}
		public void Sing() {
			System.out.println("I am a bird");
			Person.this.eat();//调用外部类的属性
		}
		public void display(String name) {
			System.out.println(name);//方法的形参
			System.out.println(this.name);//内部类的属性
			System.out.println(Person.this.name);//外部类的属性
		}
	}
	public void method() {
		class AA{
			
		}
	}
	{
		class BB{
			
		}
	}
	public Person() {
		class CC{
			
		}
	}
}

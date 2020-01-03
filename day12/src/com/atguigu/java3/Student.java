package com.atguigu.java3;
/*
 * super理解为父类的
 * super可以用来调用属性方法构造器
 * 可以在子类的方法或构造器中通过使用super.的方式调用父类中的属性或方法
 * 父类子类属性同名时，必须显式地使用调用
 * 
 * 
 * */
public class Student extends Person {
 String major;
 int id = 1001;
 public Student() {
	 
 }
public Student(String major) {
	 this.major = major;
 }
@Override
	public void eat() {
		System.out.println("学生，多吃有营养的食物");
	}
public void study() {
	System.out.println("学生学习知识");
}
public void show() {
	System.out.println(this.name+""+this.age);
	System.out.println(id);
	System.out.println(super.id);
}
}

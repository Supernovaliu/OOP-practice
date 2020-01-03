package com.flora.extend;
/*
 * 面向对象的特征之二：继承性
 * 1.减少了代码的冗余
 * 2.便于功能的扩展
 * 3.为多态性的使用提供了前提
 * 继承性的格式：class A extends B{}
 * A:subclass
 * B:superclass
 * 一旦A继承B以后，子类A中就获取了B中声明的结构：属性，方法
 * 特别的，父类中声明为private的属性方法，仍然认为回去了父类的属性方法，只是因为封装性的影响 ，不能直接调用
 * 子类继承父类后，还可以声明自己特有的属性和方法，实现功能的扩展
 * 子类和父类的关系不同于子集和集合的关系
 * extends：延展，扩展
 * Java中关于继承性的规定
 * 1.一个类可以被多个子类继承
 * 2.一个类只能有一个父类：单继承
 * 3.父子类是相对的概念
 * 4.子类直接继承的父类，称为直接父类
 * 
 * 如果没有显式地声明一个类的父类的话，则此类继承于java.lang.object类
 * 所有的java类都直接或间接地继承于java.lang.Object类
 * */

public class ExtendsTest {
public static void main(String[] args) {
	Person p1 = new Person();
	p1.age = 1;
	p1.eat();
	
	Student s1 = new Student();
	s1.eat();
	s1.sleep();
	s1.name = "Tom";
}
}

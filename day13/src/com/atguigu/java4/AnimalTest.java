package com.atguigu.java4;

import java.sql.Connection;

public class AnimalTest {
public static void main(String[] args) {
	AnimalTest test = new AnimalTest();
	test.func(new Dog());
	test.func(new Cat());
}
	public void func(Animal animal) {
		animal.eat();
		animal.bark();
	}
}
class Animal{
	public void eat() {
		System.out.println("eating");
	}
	public void bark() {
		System.out.println("barking");
	}
}
class Dog extends Animal{
	public void eat() {
		System.out.println("eating bones");
	}
	public void bark() {
		System.out.println("barking wang");
	}
}
class Cat extends Animal{
	public void eat() {
		System.out.println("eating fish");
	}
	public void bark() {
		System.out.println("barking miaow");
	}
}
class Driver{
	public void doData(Connection conn) {
	}
}
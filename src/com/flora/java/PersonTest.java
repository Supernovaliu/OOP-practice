package com.flora.java;
/*
 * 抽象类的匿名子类
 * 
 * 
 * */
public class PersonTest {
public static void main(String[] args) {
	method(new Student());//匿名对象
	Worker worker = new Worker();//非匿名的类非匿名的对象
	method1(worker);
	System.out.println("************");
	
	method1(new Person() {

		@Override
		public void enjoy() {
			System.out.println("hahahahahha111");
			
		}
		
	});
	//创建了一个 匿名类的对象
	Person p = new Person() {

		@Override
		public void enjoy() {
			System.out.println("hahahahahha");
			
		}
		
	};
	method1(p);
}
public static void method1(Person p) {
	p.eat();
	p.walk();
	p.enjoy();
}
public static void method(Student s) {
	
}
}
class Worker extends Person{

	@Override
	public void enjoy() {
		// TODO Auto-generated method stub
		
	}
	
}
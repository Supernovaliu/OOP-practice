package com.flora.practice;
/*this可以用来修饰，调用属性，方法，，构造器
 * this修饰属性和方法，this理解为当前对象
 * 在类的方法中，我们可以使用“this.属性”或“this.方法”的方式调用当前对象属性或方法，但是，通常情况下都省略
 * 如果方法的形参和类的属性同名时，我们必须显式的使用“this.变量”的 方式，表明此变量是属性，而非形参
 * this可以理解为当前对象或当前正在创建的对象
 * 我们在类的构造器中，可以显式的使用“this(形参列表)”方式，调用本类中指定的其他构造器
 * 不能用这种方式调用自己
 * 如果一个类中有n个构造器，则最多有n-1使用了此方法
 * 必须声明在构造器首行
 * 构造器内部最多只能声明一个
 * */
public class Person2 {
 public static void main(String[] args) {
	Person p1 = new Person();
	p1.setAge(20);
	System.out.println(p1.getAge());
}
}
class Person3{
	private String name;
	private int age;
			public void setName(String name) {
		this.name = name;
	}
			public String getName() {
				return name;
			}
			public void setAge(int age) {
				this.age = age;
			}
			public int getAge() {
				return age;
			}
}
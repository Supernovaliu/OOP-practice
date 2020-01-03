package com.flora.object;
//面向对象的特征一：封装与隐藏
//当我们创建一个类的对象后，我们可以通过“对象.属性”的方式，对对象进行赋值
//可以给属性赋值加入额外的限制条件，只能通过方法进行限制条件的添加
//需要将属性声明为私有的
//封装性的体现：将类的属性私有化，同时，通过公共的方法来获取和设置此属性的值
//封装性的体现：1.如上2.不对外暴露的私有的方法3.单例模式
//封装性的体现需要权限修饰符来配合
//Java规定的四种权限：（从小到大），private，default，protected，public
//四种权限都可以修饰类的内部结构：属性，方法，构造器，内部类
//修饰类的话，只能使用缺省和public
//Java提供了四种权限修饰符来修饰类及类的内部结构，体现类及类的内部结构在被调用时的可见性大小

public class AnimalTest {
  public static void main(String[] args) {
	Animal a = new Animal();
	a.name ="大黄";
		/* a.age = 1; */
	
	a.setLegs(-6);
	a.show();
	
	
}
}
class Animal{
	String name;
	private int age;
	private int legs;
	//对属性的设置
	public void setLegs(int l) {
		if(l>=0&&l%2==0) {
			legs = 1;
		}else {
			legs = 0;
		}
	}
	//对属性的获取
	public int getLegs() {
		return legs;
	}
	public void eat() {
		System.out.println("动物进食");
	}
	public void show() {
		System.out.println("name ="+name+""+age+""+legs);
	}
	public int getAge() {
		return age;
	}
	public void setAge(int a) {
		age = a;
	}
}

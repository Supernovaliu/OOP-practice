package com.flora.oop;
//成员变量与局部变量
//在类中声明的位置不同 属性：直接定义在类的一对{}内。局部变量：方法类，方法形参
//定义的位置不同
//属性可以在声明属性时，指明其权限，使用权限修饰符private,public,缺省，protected
//目前声明属性都使用缺省
//局部变量不可以使用权限修饰符
//默认初始化值   类的属性，根据其类型，都有初始化值
//局部变量没有默认初始化值，使用局部变量前一定要显式赋值
//特别地，形参在调用时，我们赋值即可
//属性加载到堆空间中（非static）
//局部变量加载到栈空间中
public class UserTest {
  public static void main(String[] args) {
	User u1 = new User();
	System.out.println(u1.name);
	System.out.println(u1.age);
	System.out.println(u1.isMale);
	u1.talk("日语");
}
}
class User{
	String name;
	int age;
	boolean isMale;
	
	public void talk(String languages) {
		System.out.println("我们使用"+languages+"进行交流");
		
	}
	public void eat() {
		String food = "烙饼";
	    System.out.println("北方人爱吃"+food);
	}
}

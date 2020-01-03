package com.flora.java4;
//接口和类是并列的两个结构
//定义接口中的成员
/*JDK7及以前，只能定义全局常量和抽象方法
 * public static final(接口中书写时可以省略),public abstract
 * JDK8，还可以定义静态方法和默认方法
 * 接口中不能定义构造器,意味着接口不能实例化
 * java开发中，接口都通过类实现（implements）
 * 如果实现类覆盖了接口中的所有抽象方法，则此类可以实例化
 * 否则此类仍为一个抽象类
 * java类可以实现多个接口-->弥补了Java单继承性的局限性
 * class AA extends BB implements CC,DD,EE
 * 接口与接口之间可以多继承
 * 接口的具体使用，能够体现多态性
 * 接口，实际上可以看作是一种规范
 * */
public class InterfaceTest {
 public static void main(String[] args) {
	System.out.println(Flyable.MAX_SPEED);
	System.out.println(Flyable.MIN_SPEED);
	Plane plane = new Plane();
	plane.fly();
}
}
interface Attackable{
	void attack();
}
interface Flyable{
	public static final int MAX_SPEED = 7900;//第一宇宙速度
	public static final int MIN_SPEED = 1;
	public abstract void fly();
	void stop();
}

class Plane implements Flyable{

	@Override
	public void fly() {
		System.out.println("flying");
		
	}

	@Override
	public void stop() {
		System.out.println("stop!");
		
	}
	
}
abstract class Kite implements Flyable{
	
}
class Bullet extends Object implements Flyable,Attackable,CC{

	@Override
	public void attack() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void fly() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void stop() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void method1() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void method2() {
		// TODO Auto-generated method stub
		
	}
	
}
interface AA{
	void method1();
}
interface BB{
	void method2();
}
interface CC extends AA,BB{
	
} 
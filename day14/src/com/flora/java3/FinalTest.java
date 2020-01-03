package com.flora.java3;
/*final:最终的
 * 可以用来修饰结构，类，方法
 * 用来修饰类表示是最后一个子类,比如string,system,StringBuffer类
 * final用来修饰方法表示表示方法不可以被重写
 *比如Object类中的getClass()，native表示调用底层的代码
 *final修饰变量，此时的变量称为一个常量 (显式初始化,代码块中初始化，构造器中初始化)
 *FINAL修饰局部变量
 *尤其是使用final修饰形参时，表明此形参是一个常量，一旦赋值就只能调用不能修改
 *static final:只能用来修饰属性和方法，用来修饰的属性也称全局常量
 * */
public class FinalTest {
final int width = 10;
final int LEFT;
final int RIGHT;
//final  int DOWN;
{
	
	LEFT=1;
}
public FinalTest() {
	RIGHT = 2;
}
public FinalTest(int n) {
	RIGHT = n;
}

	/*
	 * public void setDown(int down) { DOWN = down; }
	 */
public void doWidth() {
    //width = 20;
}
public void show() {
	final int NUM = 10;
	//num+=20;
}
public void show(final int num) {
	System.out.println(num );
}
}
final class FinalA{
	
}
class AA{
	public final void show() {
		
	}
}
class BB extends AA{
	//public void show()
}
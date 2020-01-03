package com.flora.object;
//在同一个类中允许存在一个以上的同名的方法
//两同一不同，同一个类相同方法。参数列表不同，参数个数不同,参数类型不同
//跟方法的权限修饰符，返回值类型，形参类型，方法体都没有关系
//在通过对象调用方法时，如何确定某一个指定的方法
//1.方法名2.参数列表
public class OverLoad {
	public static void main(String[] args) {
		OverLoad test = new OverLoad();
		test.getSum(1,2);
	}
	public void getSum(int i,int j) {
		System.out.println("1");
	}
	public void getSum(double d1,double d2) {
		System.out.println("2");
	}
  public void getSum(String s,int i) {
	  System.out.println("3");
  }
  public void getSum(int i, String s) {
	  System.out.println("4");
  }
}

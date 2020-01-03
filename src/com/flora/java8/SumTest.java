package com.flora.java8;

public class SumTest {
	public static void main(String[] args) {
		doSum(10,20);
		doSum(10.0,20.0);
	}
public static void doSum(Integer x,Integer y) {
	System.out.println("Integer sum"+(x+y));
	
}
public static void doSum(double x,double y) {
	System.out.println("double sum"+(x+y));
	
}
public static void doSum(float x,float y) {
	System.out.println("float sum"+(x+y));
	
}
public static void doSum(int x,int y) {
	System.out.println("Int sum"+(x+y));
	
}
}

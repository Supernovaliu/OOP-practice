package com.flora.java8;

public interface CompareA {
	//
public static void method1() {
	System.out.println("CompareA:beijing");
}
 public default void method2() {
	System.out.println("CompareA:shanghai");
}
 default void method3() {
	 System.out.println("CompareA:shanghai");
 }
}

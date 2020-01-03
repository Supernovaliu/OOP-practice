package com.flora.practice;

public class TriAngleTest {
 public static void main(String[] args) {
	 TriAngle t = new TriAngle();
	 t.setBase(5);
	 t.setHeight(8);
	 double s = t.getBase()*t.getHeight()/2;
	 System.out.println(s);
}
   
}

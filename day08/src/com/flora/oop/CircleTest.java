package com.flora.oop;

public class CircleTest {
  public static void main(String[] args) {
	Circle c1 = new Circle();
	c1.radius = 2.1;
		/*
		 * double area = c1.findArea(); System.out.println(area);
		 */
	c1.findArea();
}
}
class Circle{
	double radius;
	/*
	 * public double findArea() { double area = Math.PI*radius*radius; return area;
	 * }
	 */
	public void findArea() {
		double area = Math.PI*radius*radius;
		System.out.println("area is:"+area);
	}
}

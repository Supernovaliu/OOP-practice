package com.flora.java;

public class CircleTest {
public static void main(String[] args) {
	Circle c1 = new Circle();
	Circle c2 = new Circle();
	System.out.println(c1.getId());
	System.out.println(c2.getId());
	System.out.println(Circle.getTotal());
	
}
}
class Circle{
	private double radius;
	private int id;
	public Circle() {
		id = init++;
		total++;
	}
	public Circle(double radius) {
		this();
		this.radius = radius;
	//	id = init++;
		//total++;
	}
	public double getRadius() {
		return radius;
	}

	public void setRadius(double radius) {
		this.radius = radius;
	}

	public int getId() {
		return id;
	}

	public static int getTotal() {
		return total;
	}
	public static void setTotal(int total) {
		Circle.total = total;
	}
	public void setId(int id) {
		this.id = id;
	}
	private static int total;
	private static int init = 1001;
	
	public double findArea() {
		return 3.14*radius*radius;
	}
}
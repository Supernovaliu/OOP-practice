package com.atguigu.Practice2;

public class Circle extends GeometricObject {
    private double radius;
	protected Circle(String color, double weight, double radius) {
		super(color, weight);
		this.setRadius(radius);
	}
	public double getRadius() {
		return radius;
	}
	public void setRadius(double radius) {
		this.radius = radius;
	}
    public double findArea() {
    	return 3.14*radius*radius;
    }
}

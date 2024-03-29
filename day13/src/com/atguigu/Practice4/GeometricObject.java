package com.atguigu.Practice4;

public class GeometricObject {
	protected  String  color;
	protected  double  weight; 
	protected   GeometricObject() {
		this.color = "white";
		this.weight = 1.0;
	} 
	protected   GeometricObject(String color, double weight) {
		this.color = color;
		this.weight = weight;
	} 
	
	public void setColor(String color) {
		this.color = color;
	}
	public String getColor() {
		return color;
	}
	public double getWeight() {
		return weight;
	}
	public void setWeight(double weight) {
		this.weight = weight;
	}
}

package com.flora.object;

public class PassObject {
	public static void main(String[] args) {
		PassObject test = new PassObject();
		Circle c = new Circle();
		test.printArea(c, 5);
		System.out.println(c.radius);
	}
	public void printArea(Circle c,int time) {
		int i = 1;
		for(;i<=time;i++) {
			c.radius = i;
			System.out.println(c.radius+"\t\t"+c.findArea());
		}
		c.radius = i;
	}

}

package com.flora.extendpractice;
/*如何调试程序
 * 1.System.out.println()
 * 2.Eclipse-debug
 * 
 * */
public class CylinderTest {
public static void main(String[] args) {
	Cylinder cy = new Cylinder();
	cy.setRadius(2.1);
	cy.setLength(3.4);
	double volume = cy.findVolume();
	System.out.println(volume);
	
	double area = cy.findArea();
	System.out.println(area);
}
}

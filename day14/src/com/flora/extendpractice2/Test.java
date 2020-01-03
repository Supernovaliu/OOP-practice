package com.flora.extendpractice2;

public class Test {
 public static void main(String[] args) {
	 LatitudeTest a = new LatitudeTest(32.9,-117.2);
	 LatitudeTest b = new LatitudeTest(-12.0,-77.0);
	 System.out.println(a.distance(b));
 }
}

package com.flora.extendpractice;

public class Kids extends Mankind{
 private int yearsOld;
 public void printAge() {
	 System.out.println(yearsOld);
 }
public Kids(int yearsOld) {
	this.yearsOld = yearsOld;
}
public int getYearsOld() {
	return yearsOld;
}
public void setYearsOld(int yearsOld) {
	this.yearsOld = yearsOld;
}
public void employeed() {
	System.out.println("Kids should study");
}
}

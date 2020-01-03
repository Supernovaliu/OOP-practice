package com.flora.practice2;

public class Boy {
 private String name;
 private int age;
   public Boy(String name,int age) {
	 this.name = name;
	 this.age = age;
 }
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public int getAge() {
	return age;
}
public void setAge(int age) {
	this.age = age;
}
public void marrry(Girl girl) {
	System.out.println(girl);
}
 public void shout() {
	 if(age>=22) {
		 System.out.println("you can merry her");
	 }else {
		 System.out.println("no");
	 }
 }
}

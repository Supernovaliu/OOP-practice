package com.flora.oop;

public class Practice {
  public static void main(String[] args) {
	Student s1 = new Student();
	System.out.println(s1.Say());
}
}
class Student{
	String name;
	int age;
	String major;
	String interests;
	public String Say() {
		name  = "lihua";
		age = 10;
		major = "automation";
		interests = "reading";
		String info = name+age+major+interests;
		return info;
	}
	
}

package com.flora.extendpractice2;

public class Student extends Person {
String major;
public Student() {
}
public Student(String major) {
	this.major = major;
}
public void study() {
	System.out.println(major);
}
public void eat() {
	  System.out.println("学生应该多吃有营养的东西");
}
}

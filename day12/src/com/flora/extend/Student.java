package com.flora.extend;

public class Student extends Person{

String major;
public Student() {
	
}
public Student(String name, int age, String major) {
	super();
	this.name = name;
	this.age = age;
	this.major = major;
}

public void study() {
	System.out.println("学习");
}
}

package com.flora.java3;

public abstract class Employee {
 private String name;
 private int age;
 private MyDate birthday;
 
 public abstract double earnings();

@Override
public String toString() {
	return "Employee [name=" + name + ", age=" + age + ", birthday=" + birthday.toDateString() + "]";
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

public MyDate getBirthday() {
	return birthday;
}

public void setBirthday(MyDate birthday) {
	this.birthday = birthday;
}

public Employee(String name, int age, MyDate birthday) {
	super();
	this.name = name;
	this.age = age;
	this.birthday = birthday;
}
 
 
}

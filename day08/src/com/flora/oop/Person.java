package com.flora.oop;

public class Person {
    String name;
    int age;
    int sex;
    
    public void study() {
    	System.out.println("studying");
    }
    public void showAge() {
    	System.out.println("age"+age);
    }
    public int addAge(int i) {
    	age +=i;
    	return age;
    }
}


package com.flora.java2;

public class Manager extends Employee {
 private double bonus;

public Manager(String name, int id, double salary, double bonus) {
	super(name, id, salary);
	this.bonus = bonus;
}

public Manager() {
	super();
	// TODO Auto-generated constructor stub
}

public Manager(String name, int id, double salary) {
	super(name, id, salary);
	// TODO Auto-generated constructor stub
}

@Override
public void work() {
	System.out.println("managing");
	
}
 
}

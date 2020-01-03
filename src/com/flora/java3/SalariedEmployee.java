package com.flora.java3;

public class SalariedEmployee extends Employee{
    private double monthlySalary;
    
	public SalariedEmployee(String name, int age, MyDate birthday) {
		super(name, age, birthday);
		
	}
	public SalariedEmployee(String name, int age, MyDate birthday,double monthlySalary) {
		super(name, age, birthday);
		this.monthlySalary = monthlySalary ;
	}

	@Override
	public double earnings() {
		return monthlySalary;
		
	}
 public String toString() {
	 return super.toString();
 }

public double getMonthlySalary() {
	return monthlySalary;
}

public void setMonthlySalary(int monthlySalary) {
	this.monthlySalary = monthlySalary;
}
 
}

package com.flora.practice;

public class CustomerTest {
public static void main(String[] args) {
	Account acc = new Account(1000,2000,0.0123);
	Customer cust = new Customer("Jane","Smith");
	cust.setAccount(acc);
	cust.getAccount().deposite(100);
	cust.getAccount().withdraw(960);
	cust.getAccount().withdraw(2000);
	System.out.println(cust.getFirstName()+""+cust.getLastName()+""+cust.getAccount().getId()+""+cust.getAccount().getBalance());
}
}

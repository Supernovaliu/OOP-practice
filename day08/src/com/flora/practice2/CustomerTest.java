package com.flora.practice2;

public class CustomerTest {
  public static void main(String[] args) {
	Customer cust= new Customer("Jane ","Smith");
	Account acct = new Account(1000,2000,0.0123);
	cust.setAccount(acct);
	cust.getAccount().deposit(100);
	cust.getAccount().withdraw(960);
	cust.getAccount().withdraw(2000);
	System.out.println("Customer["+cust.getLastName()+","+cust.getFirstName()+"]has a account:id is"+cust.getAccount().getId()+cust.getAccount().getAnnualInterestRate()+""+cust.getAccount().getBalance());
}
}

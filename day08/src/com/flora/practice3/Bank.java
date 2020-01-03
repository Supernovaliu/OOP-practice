package com.flora.practice3;

public class Bank {
  private Customer[]customer;
  private int numberOfCustomer;//record the number of customer
  public Bank() {
	  customer = new Customer[10];
  }
  public void addCustomer(String f,String l) {
	  Customer cust = new Customer(f,l);
	  customer[numberOfCustomer++] = cust;//给数组赋值
	 
  }
  public int getnumberOfCustomer() {
	  return numberOfCustomer;
  }
  public  Customer getCustomer(int index) {
	  if(index>=0&&index<numberOfCustomer) {
		  return customer[index];
	  }
	  return null;
  }
}

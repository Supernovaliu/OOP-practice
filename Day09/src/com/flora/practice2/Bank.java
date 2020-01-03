package com.flora.practice2;

public class Bank {
private  Customer1 cust[];
private int numberOfCustomer;
public Bank() {
	cust = new Customer1[10];
}
public void addCustomer(String f,String l) {
	Customer1 cus = new Customer1(f,l);
	cust[numberOfCustomer++] = cus;
}

public Customer1 getCust(int index) {
	if(index>=0&&index<=numberOfCustomer) {
		return cust[index];
	}
	return null;
}
public int getNumberOfCustomer() {
	return numberOfCustomer;
}

}

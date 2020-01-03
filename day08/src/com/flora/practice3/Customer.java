package com.flora.practice3;

public class Customer {
private String firstNme;
private String lastName;
private Account account;
public Customer(String f, String l) {
	super();
	this.firstNme = f;
	this.lastName = l;
}
public Account getAccount() {
	return account;
}
public void setAccount(Account account) {
	this.account = account;
}
public String getFirstNme() {
	return firstNme;
}
public String getLastName() {
	return lastName;
}

}

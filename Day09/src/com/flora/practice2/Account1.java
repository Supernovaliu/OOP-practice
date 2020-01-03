package com.flora.practice2;

public class Account1 {
 private double balance;
 public Account1(double balance) {
	 this.balance = balance;
 }
public double getBalance() {
	return balance;
}
 public void deposite(double amount) {
	 balance+= amount;
 }
 public void withdraw(double amount) {
	 if(amount>balance) {
		 System.out.println("余额不足");
	 }else {
		 balance-=amount;
		 System.out.println("取款成功");
	 }
 }
}

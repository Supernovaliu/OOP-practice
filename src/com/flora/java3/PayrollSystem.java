package com.flora.java3;

import java.util.Calendar;
import java.util.Scanner;

public class PayrollSystem {
public static void main(String[] args) {
	//Scanner scan = new Scanner(System.in);
	//System.out.println("请输入当月的月份");
	//int month = scan.nextInt();
	//
	Calendar calendar = Calendar.getInstance();
	int month = calendar.get(Calendar.MONTH);//一月份：0
	System.out.println(month);
	Employee[] emps = new Employee[2];
	emps[0] = new SalariedEmployee("Masen",1002,new MyDate(1991,2,28),10000);
	emps[1] = new HourlyEmployee("Pan",2001,new MyDate(1991,1,6),60,240);
	for(int i = 0;i<emps.length;i++) {
		System.out.println(emps[i]);
		double salary = emps[i].earnings();
		System.out.println(salary);
		if((month+1)== emps[i].getBirthday().getMonth()) {
			System.out.println("生日快乐，奖励一百元");
		}
	}
	
	
}
}

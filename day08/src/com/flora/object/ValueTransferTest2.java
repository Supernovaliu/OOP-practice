package com.flora.object;

public class ValueTransferTest2 {
public static void main(String[] args) {
	Data test = new Data();
	test.m = 10;
	test.n = 20;
	System.out.println(test.m+""+test.n);
	ValueTransferTest2 test1 = new ValueTransferTest2();
	test1.swap(test);
	System.out.println(test.m+""+test.n);
}
public void swap(Data test) {
	int temp = test.m;
	test.m = test.n;
	test.n = temp;
	
}
}
class Data{
	int m;
	int n;
}
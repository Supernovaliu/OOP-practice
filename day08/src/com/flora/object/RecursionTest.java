package com.flora.object;
//递归：一个方法体内调用它自身
public class RecursionTest {
//计算1-100之间所有自然数的和
	public static void main(String[] args) {
		/*
		 * int sum = 0; for(int i = 1;i<=100;i++) { sum+=i; }
		 */
		RecursionTest test = new RecursionTest();
		int sum1 = test.getSum(100);
		System.out.println(sum1);
		test.f(10);
		System.out.println(test.f(10));
	}
	public int getSum(int n) {
		if(n ==1) {
			return 1;
		}else {
			return n+getSum(n-1);
		}
	}
	public int f(int n) {
		if(n==0) {
			return 1;
		}else if(n == 1){
			return 4;
		}else {
			return 2*f(n-1)+f(n-2);
		}
	}
	//斐波那契数列
	//汉诺塔问题
	//快排
}

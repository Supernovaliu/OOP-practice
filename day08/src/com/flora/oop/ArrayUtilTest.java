package com.flora.oop;

public class ArrayUtilTest {
 public static void main(String[] args) {
	ArrayUtil util = new ArrayUtil();
	int[] arr =  new int[] {32,34,32,5,3,54,654,-98,0,-53,5};
	//int max = util.getMax(arr);
	//System.out.println(max);
	
		/*
		 * int min = util.getMin(arr); System.out.println(min);
		 * 
		 * int sum1 = util.getSum(arr); System.out.println(sum1);
		 * 
		 * int avg1 = util.getAvg(arr); System.out.println(avg1);
		 */
	
		/*
		 * util.reverse(arr); for(int i = 0;i<arr.length;i++) {
		 * System.out.println(arr[i]); }
		 */
	util.sort(arr);
	for(int i = 0;i<arr.length;i++) {
		  System.out.println(arr[i]); }
	
}
}

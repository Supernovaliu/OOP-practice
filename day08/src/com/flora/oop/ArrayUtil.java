package com.flora.oop;

public class ArrayUtil {
   public int getMax(int[] arr){
	   for(int i = 0;i<arr.length-1;i++) {
		   if(arr[i]>arr[i+1]) {
			  int temp = arr[i];
			  arr[i]  = arr[i+1];
			  arr[i+1] = temp;  
		   }
	   }
	   return arr[(arr.length)-1] ;
   }
   public int getMin(int[] arr){
	   for(int i = 0;i<arr.length-1;i++) {
		   if(arr[i]<arr[i+1]) {
			  int temp = arr[i];
			  arr[i]  = arr[i+1];
			  arr[i+1] = temp;  
		   }
	   }
	   return arr[arr.length-1] ;
   }
   public int getSum(int[] arr) {
	   int sum = 0;
	   for(int i = 0;i<arr.length;i++) {
		    sum += arr[i];
	   }
	   return sum;
   }
   public int getAvg(int[] arr){
	   int avg = getSum(arr) /arr.length;
	   return avg ;
   }
   public void reverse(int[] arr) {
	   for(int i = 0;i<=arr.length/2;i++) {
		  int temp = arr[arr.length-i-1];
		   arr[arr.length-i-1] = arr[i];
		   arr[i] = temp;
	   }
   }
   public int[] copy(int[] arr) {
	   return null;
   }
   public void sort(int[] arr) {
	   for(int i = 0;i<arr.length-1;i++) {
		   for(int j = 0;j<arr.length-1-i;j++) {
			   if(arr[j]>arr[j+1]) {
				  int temp = arr[j+1];
				  arr[j+1] = arr[j];
				  arr[j] = temp;
			   }
		   }
	   }
   }
   public void print(int[] arr) {
	   
   }
   public int getIndex(int[] arr,int dest) {
	   return 0;
   }
}

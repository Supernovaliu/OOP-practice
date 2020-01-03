package com.flora.oop;

public class Practice2 {
  public static void main(String[] args) {
	Practice2 test = new Practice2();
		/* test.method(); */
		/*
		 * int area = test.method(); System.out.println(area);
		 */
		/* System.out.println(test.method()); */
	int area= test.method(12,10);
	System.out.println(area);
}
 /* public void method() {
	  for(int i = 0;i<10;i++) {
		  for(int j =0;j<8;j++) {
			  System.out.println("* ");
		  }
		  System.out.println();
	  }*/
	/*
	 * public int method() { for(int i = 0;i<10;i++) { for(int j = 0;j<8;j++) {
	 * System.out.print("* "); } System.out.println(); } return 10*8; }
	 */
 
  public int method(int m,int n) {
	  for(int i =0;i<m;i++) {
		  for(int j = 0;j<n;j++) {
			  System.out.print("* ");
		  }
		  System.out.println();
	  }
	  return m*n;
  }
  }
/* } */

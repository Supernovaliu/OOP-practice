package com.atguigu.java5;

import org.junit.Test;

/*
 * step:select present project - build path-add libraries-JUnit
 * create a class for unit testing:must be a public class and have a public constructor without parameter
 * declare a public unit testing method without return and parameter
 * above this method must be declared comment"@Test" and import org.JUnit.test;
 * right-double click the name of method and then run as JUnit Test
 * if the progress bar is green then nothing wrong
 * if the progress bar is red then there is exception in the code
 * */
public class JUnitTest {
	int num = 10;
	
  @Test
 public void testEquals() {
	 String s1 = "MM";
	 String s2 = "MM";
	 System.out.println(s1.contentEquals(s2));
	 System.out.println(num);
 }
}

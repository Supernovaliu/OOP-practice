package com.flora.object;

public class OverLoadTest {
  public void mOL(int i) {
	  System.out.println(i*i);
  }
  public void mOL(String s) {
	  System.out.println(s);
  }
  public void mOL(int i,int j) {
	  System.out.println(i*j);
  }
  public int max(int i,int j) {
	  return(i>j)?i:j;
  }
  public double max(double i,double j) {
	  return(i>j)?i:j;
  }
  public double max(double d1,double d2,double d3) {
	  return(((d1>d2)?d1:d2)>d3)?((d1>d2)?d1:d2):d3;
  }
}

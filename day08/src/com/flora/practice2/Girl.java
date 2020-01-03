package com.flora.practice2;

public class Girl {
  private String name;
  private int age;
  public Girl() {
		
		
	}
  public Girl(String name, int age) {
		
		this.name = name;
		this.age = age;
	}
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public void marry(Boy boy) {
	System.out.println("I want to marry"+boy.getName());
	boy.marrry(this);
}
/**
 * 比较两个对象的大小，正数，当前对象大，0,当前对象与形参对象相等
 * @param girl
 * @return
 */
  public int compare(Girl girl) {
	  if(this.age>girl.age) {
		  return 1;
	  }else if(this.age<girl.age) {
		  return -1;
	  }else {
		  return 0;
	  }
  }
}

package com.flora.practice;
//构造器的使用constructor,fields,constructor,method
//构造器的作用：创建对象，初始化对象的属性
//如果没有显式地定义类的构造器，则系统默认提供一个空参的构造器
//定义构造器的格式 权限修饰符 类名（形参列表）{}
//一个类中定义的多个构造器彼此构成重载
//一旦显式地定义了类的构造器之后，系统就不再提供默认的空参构造器
//一个类中至少会有一个构造器
public class TriAngle {
  private double base;
  private double height;
  public TriAngle() {
	  
  }
  public TriAngle(double a,double b) {//可以初始化赋值
	  base = a;
	  height = b;
  }
  public void setBase(double a) {
	  base = a;
  }
  public double getBase() {
	  return base;
  }
  public void setHeight(double b) {
	  height = b;
  }
  public double getHeight() {
	  return height;
  }
}

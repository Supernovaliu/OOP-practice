package com.flora.oop;

public class ObjectArrayTest {
  public static void main(String[] args) {
	  StudentAnother[] stus = new StudentAnother[20];//对象数组
	  for(int i =0;i<stus.length;i++) {
		  stus[i] = new StudentAnother();
		  stus[i].number1 = (i+1);
		  stus[i].state = (int)(Math.random()*(6-1+1)+1);
		  stus[i].score = (int)(Math.random()*(100-0+1));
	  }
	  //for(int i = 0;i<stus.length;i++) {
			/* System.out.println(stus[i].number+""+stus[i].state+""+stus[i].score); */
		  //System.out.println(stus[i].info());
	  //}
		/*
		 * for(int i = 0;i<stus.length;i++) { if(stus[i].state ==3) {
		 * System.out.println(stus[i].info()); } }
		 */
	  //使用冒泡排序按学生成绩排序
	  for(int i = 0;i<stus.length-1;i++) {
		  for(int j =0;j<stus.length-1-i;j++) {
			  if(stus[j].score>stus[j+1].score) {
			StudentAnother temp = stus[j];
			  stus[j] = stus[j+1];
			  stus[j+1] = temp;
			  }
		  }
	  }
	  for(int i =0;i<stus.length;i++) {
		  System.out.println(stus[i].info());
	  }
}
}
class StudentAnother{
	int number1;
	int state;
	int score;
	public String info() {
		return "学号"+number1+"年级"+state+"成绩"+score;
	}
}

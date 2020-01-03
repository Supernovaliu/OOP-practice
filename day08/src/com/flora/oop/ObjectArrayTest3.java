package com.flora.oop;

public class ObjectArrayTest3 {
  public static void main(String[] args) {
	  Student2[] stus = new Student2[20];//对象数组
	  for(int i =0;i<stus.length;i++) {
		  stus[i] = new Student2();
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
	  ObjectArrayTest3 test = new ObjectArrayTest3();
	  test.print(stus);
	  
	  test.searchState(stus, 3);
	  test.sort(stus);
	  test.print(stus);
	  
	  
	  System.out.println("************************************");
	  for(int i =0;i<stus.length;i++) {
		  System.out.println(stus[i].info());
	  }
}
 //遍历student2
  public void print(Student2[] stus) {
	for(int i = 0;i<stus.length;i++) {
	  System.out.println(stus[i].info());
} 
  }
  /**
   * 
   * @param stus
   * @param state
   */
  public void searchState(Student2[] stus,int state) {
	   for(int i = 0;i<stus.length;i++) {
		   if(stus[i].state ==state) {
			 System.out.println(stus[i].info()); 
			 } }
	   
  }
  /**
   * 
   * @param stus
   */
  public void sort(Student2[] stus) {
	  for(int i = 0;i<stus.length-1;i++) {
		  for(int j =0;j<stus.length-1-i;j++) {
			  if(stus[j].score>stus[j+1].score) {
			Student2 temp = stus[j];
			  stus[j] = stus[j+1];
			  stus[j+1] = temp;
			  }
		  }
	  }
  }
}
class Student2{
	int number1;
	int state;
	int score;
	public String info() {
		return "学号"+number1+"年级"+state+"成绩"+score;
	}
}

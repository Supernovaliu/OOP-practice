package Practice;
import java.util.Arrays;
import java.util.Collection;
import java.util.Scanner;
import java.util.Collections;
public class ArrayDemo2 {
     public static void main(String[] args) {
		//使用Scanner读取学生个数
    	 //创建数组，存储学生成绩，动态初始化
    	 //给数组中的元素赋值
    	 //获取数组中的元素的最大值
    	 //求出等级
    	Scanner scan = new Scanner(System.in);
    	System.out.println("请输入学生人数：");
    	
    	int studentNumber = scan.nextInt();
    	int[] studentGrade = new int[studentNumber];
    	System.out.println("请输入学生成绩");
    	int maxScore = 0;
    	for (int i = 0;i<studentGrade.length;i++){
    		studentGrade[i] = scan.nextInt();
    		if(maxScore<studentGrade[i]) {
    			maxScore = studentGrade[i];
    		}
    		
    	}
    	
//    	for(int i = 0;i<studentGrade.length;i++) {
//    		if(maxScore<studentGrade[i]) {
//    			maxScore = studentGrade[i];
//    		}
    		
    	
    	char level;
    	for(int i = 0;i<studentGrade.length;i++) {
    		if(maxScore-studentGrade[i]<=10) {
    			level = 'A';
    		}else if(maxScore-studentGrade[i]<=20) {
    			level = 'B';
    		}else if(maxScore-studentGrade[i]<=30) {
    			level = 'C';
    		}else {
    			level = 'D';
    		}
    		System.out.println("Student"+i+"score is"+studentGrade[i]+",grade is"+level);
    	}
	}
}

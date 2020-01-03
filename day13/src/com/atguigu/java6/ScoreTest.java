package com.atguigu.java6;

import java.util.Scanner;
import java.util.Vector;

/*
 * 1.实例化scanner
 * 2.创建vector对象
 * 3.通过for（；；；）或while（TRUE），给vector中添加值
 * v.addElement(Object obj)
 * 
 * */
public class ScoreTest {
public static void main(String[] args) {
	Scanner scan = new Scanner(System.in);
	Vector v = new Vector();
	int maxScore = 0;
	for(;;) {
		System.out.println("请输入学生成绩");
		int score = scan.nextInt();
		if(score<0) {
			break;
		}
		if(score>100) {
			System.out.println("请重新输入");
			continue;
		}
		//Integer inScore = new Integer(score);
		v.addElement(score);
		if(maxScore<score) {
			maxScore = score;
		}
	}
	char level;
	for(int i = 0;i<v.size();i++) {
		Object obj = v.elementAt(i);
		//Integer inScore = (Integer)obj;
		//int score = inScore.intValue();
		int score = (int)obj;
		if(maxScore - score<=10) {
			level = 'A';
		}else if(maxScore - score<=20) {
			level = 'B';
		}else if(maxScore - score<=30) {
			level = 'C';
		}else {
			level = 'D';
		}
		System.out.println(i+""+score+""+level);
	}
}
}

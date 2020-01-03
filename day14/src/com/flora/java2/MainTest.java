package com.flora.java2;
//main方法也是一个普通的静态方法
//main方法也可以作为与控制台交互的方式
public class MainTest {
public static void main(String[] args) {
	Main.main(new String[100]);
}
}

class Main{
	public static void main(String[] args) {
		
		for(int i = 0;i<args.length;i++) {
			args[i] = "args_"+i;
			System.out.println(args[i]);
		}
	}
}

package com.flora.practice2;

public class BoyGirlTest {
 public static void main(String[] args) {
	Boy boy = new Boy("Romeo",22);
	boy.shout();
	Girl girl = new Girl("Juliet",18);
	girl.marry(boy);
	Girl girl1 = new Girl("zhuyingtai",19);
	int compare = girl.compare(girl1);
	if(compare>0) {
		System.out.println(girl.getName()+"elder");
	}else if(compare<0) {
		System.out.println(girl1.getName()+"younger");
	}else {
		System.out.println("same");
	}
			
}
}

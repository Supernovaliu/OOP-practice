package com.flora.oop;
//类中方法的声明和使用
//void没有返回值
//方法的声明：权限修饰符 返回值类型 方法名（形参列表）{
//方法体
//}
//权限修饰符：private public 缺省 protected
//返回值类型：有返回值or没有返回值
//如果方法有返回值，则必须在方法声明时，指定返回值的类型，使用return关键字来返回变量或常量
//我们定义方法该不该有返回值？1.题目要求2.凭经验
//方法名属于标识符，遵循标识符规则和规范
//形参列表，方法可以声明0个，1个，或多个形参。
//格式：数据类型1 形参1，数据类型2 形参2.。。。
//该不该定义形参？1.题目要求2.凭经验，具体问题具体分析
//方法体：方法功能的体现
//return使用范围：使用在方法体中 作用：1.结束方法2.针对于有返回值类型的方法，使用“return 数据”方法返回所要的数据
//注意点：return关键字后面不可以声明执行语句
//方法的使用中，可以调用当前类的属性和方法
//特殊的，方法A中又调用了方法A：递归
//方法中不能定义 方法
public class CustomerTest {
   public static void main(String[] args) {
	   Customer cust1 = new Customer();
	   cust1.eat();
}
}
class Customer{
	String name;
	int age;
	boolean isMale;
	
	public void eat() {
		System.out.println("客户吃饭");
	}
	public void sleep(int hour) {
		System.out.println("休息了"+hour);
}
	public String getName() {
		return name;
	}
	public String getNation(String nation) {
		String info = "我的国籍是"+nation;
		return info;
	}
	
}
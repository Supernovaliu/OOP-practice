package com.flora.java4;
//接口使用上也满足多态性
//接口，实际上就是定义了一种规范
//面向接口编程
public class USBTest {
public static void main(String[] args) {
	Computer com = new Computer();
	//创建了接口的非匿名实现类的非匿名对象
	Flash flash = new Flash();
	com.transferDate(flash);
	//创建接口的非匿名实现类的匿名对象
	com.transferDate(new Printer());
	//创建接口匿名实现类的非匿名对象
	USB phone = new USB() {

		@Override
		public void start() {
			System.out.println("phone starts working");
			
		}

		@Override
		public void stop() {
			System.out.println("phone ends work");
			
		}
		
	};
	com.transferDate(phone);
	//匿名实现类的匿名对象
	com.transferDate(new USB() {

		@Override
		public void start() {
			System.out.println("starting");
			
		}

		@Override
		public void stop() {
			System.out.println("stop");
			
		}
		
	});
}
}
class Computer{
	public void transferDate(USB usb) {
		usb.start();
		System.out.println("start");
		usb.stop();
		System.out.println("stop");
	}
}
interface USB{
	void start();
	void stop();
}
class Flash implements USB{

	@Override
	public void start() {
		System.out.println("start working");
		
	}

	@Override
	public void stop() {
		System.out.println("stop working");
		
	}
	
}
class Printer implements USB{

	@Override
	public void start() {
		System.out.println("Printer starts working");
		
	}

	@Override
	public void stop() {
		System.out.println("Printer stop working");
		
	}
	
}
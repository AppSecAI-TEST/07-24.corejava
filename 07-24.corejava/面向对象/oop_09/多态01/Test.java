package oop_09.多态01;

public class Test {
	
	public static void main(String[] args) {
		//赋值多态
		打印机 d1 = new 彩色打印机();
		d1.打印();
		
		打印机 d2 = new 黑白打印机();
		
	}

}

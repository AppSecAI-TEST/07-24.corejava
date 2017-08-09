package oop_03.变量作用域;

import 测试答案.MyArrayUtils;

public class Test_静态成员变量 {

	public static void main(String[] args) {
		
		
		Customer c1 = new Customer();
		
		Customer c2 = new Customer();
		Customer c3 = new Customer();
		
		
		
//		System.out.println(login02.img);
		
		System.out.println(Customer.count);
		
		c1.sayHello("tom");
		c2.sayHello("jack");
	
		

	}

}

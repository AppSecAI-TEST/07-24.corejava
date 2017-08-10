package oop_06.继承03_super_this;

public class A {
	
	public int count;

	public A() {
		System.out.println(" A 中 默认的构造函数  A()  ");
	}

	public A(String name) {
		System.out.println("A - > name : " + name);
	}

	public A(int age) {
		System.out.println("A -> age : " + age);
	}
	
	
	public void sayHello() {
		System.out.println("我是父类  打招呼的方式 : 你好");
	}

}

package oop_06.继承03_super_this;

public class B extends A {
	
	public int count;
	
	public B() {

	}
	
	
	public B(int x , int y ) {
		super.count = y;
		this.count = x;
	}
	
	

	public B(int age) {
		super(age); // super 只能放在第一行
		System.out.println("B -> age : " + age);
	}
	
	public B(String name) {
		super(name); // super 只能放在第一行
		System.out.println("B -> name : " + name);
	}
	
	
	public void sayHi() {
		super.sayHello();
	}
	
}

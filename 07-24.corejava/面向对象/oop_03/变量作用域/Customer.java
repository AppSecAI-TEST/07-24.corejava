package oop_03.变量作用域;

public class Customer {

	public static int count = 0;
	
	//属性  ,  成员变量  , 实例变量
	public String name ;	
	public String img = "default.jpg";
	
	
	public Customer() {
		count++;
		System.out.println("第 " + count + " 位 用户登录了 . ");
	}
	
	/*
	 * name 是方法的形参  也是局部变量
	 * age 也是局部变量 
	 * 局部变量必须有初始值 ,  否则编译出错
	 * */
	public void sayHello(String name) {
		int age = 0 ;
		System.out.println("欢迎您登录 , " + name );
		System.out.println("age : " + age);
	}
	
}

package oop_05.封装01;

public class Emp {
	
	public int id;
	public String name;
	public String email;
	// 体现其封装性
	private double salary;
	
	
	// 针对私有属性  , 提供一套  可赋值 和 可获取 的 方法
	public void setSalary(double salary) {
		this.salary = salary;
	}
	
	public double getSalary() {
		return salary;
	}
	

}

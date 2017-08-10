package oop_05.封装03;

public class Emp {

	private Person person;
	
	private double salary;

	private Emp up;
	private Emp[] downs;
	
	private Dept dept;
	//我的岗位
	private WorkType type;
	
	
	

	public WorkType getType() {
		return type;
	}
	public void setType(WorkType type) {
		this.type = type;
	}
	public Dept getDept() {
		return dept;
	}
	public void setDept(Dept dept) {
		this.dept = dept;
	}
	public Person getPerson() {
		return person;
	}
	public void setPerson(Person person) {
		this.person = person;
	}
	public double getSalary() {
		return salary;
	}
	public void setSalary(double salary) {
		this.salary = salary;
	}
	public Emp getUp() {
		return up;
	}
	public void setUp(Emp up) {
		this.up = up;
	}
	public Emp[] getDowns() {
		return downs;
	}
	public void setDowns(Emp[] downs) {
		this.downs = downs;
	}

}

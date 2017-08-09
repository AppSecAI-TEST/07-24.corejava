package oop_05.·â×°03;

public class Emp {

	private Person person;
	
	private double salary;

	private Emp up;
	private Emp[] downs;

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

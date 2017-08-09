package oop_04.thiss;

public class Emp {

	public int id;

	public String name;

	public Emp() {
		
	}

	public Emp(int id , String name) {
			this.id = id;
			this.name = name;
	}
	
	
	public void getEmpInfo() {
		System.out.println("ÐÕÃû : " + this.name + " ¹¤ºÅ :  " + this.id);
	}

}

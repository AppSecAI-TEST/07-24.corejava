package oop_04.thiss;

public class TestEmp {

	public static void main(String[] args) {
		Emp e1 = new Emp();
		e1.id = 1;
		e1.name = "jack";
		
		
		Emp e2 = new Emp(2 , "tom");
		
		e1.getEmpInfo();
		e2.getEmpInfo();
		
		
	}
	
	

}

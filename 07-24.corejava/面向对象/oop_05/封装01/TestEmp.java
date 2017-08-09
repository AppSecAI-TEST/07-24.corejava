package oop_05.·â×°01;

public class TestEmp {

	public static void main(String[] args) {

		Emp emp = new Emp();	
		emp.id = 1;
		emp.name = "tom";
		emp.email = "tom@neusoft.com";
		
		emp.setSalary(6000.00);
		
		
		
		System.out.println( emp.getSalary() );

	}

}

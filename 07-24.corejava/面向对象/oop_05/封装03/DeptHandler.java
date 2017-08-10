package oop_05.·â×°03;

import org.apache.commons.lang3.ArrayUtils;

public class DeptHandler {
	
	public Emp[] addEmp(Emp[] emps , Emp newEmp) {
		
		Emp[] newEmps = ArrayUtils.add(emps,  newEmp);
		
		return newEmps;
	}

}

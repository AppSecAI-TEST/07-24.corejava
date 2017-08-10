package oop_05.封装03.test;

import oop_05.封装03.Addr;
import oop_05.封装03.Dept;
import oop_05.封装03.Emp;
import oop_05.封装03.Person;
import oop_05.封装03.WorkType;

public class Test02 {
	
	public static void main(String[] args) {
		
		Person boss = new Person();
		boss.setAge(50);
		boss.setEmail("boss@neusoft.com");
		boss.setName("boss");
		
		Emp empBoss = new Emp();
		empBoss.setPerson(boss); // 指定其个人信息
		empBoss.setSalary(100000);

		Person scott = new Person();
		scott.setAge(40);
		scott.setEmail("111@11.com");
		scott.setName("scott");
		Emp empScott = new Emp();
		empScott.setPerson(scott);
		empScott.setSalary(10000);

		
		Person jack = new Person();
		jack.setAge(20);
		jack.setEmail("jack@123.com");
		jack.setName("jack");
		Emp empJack = new Emp();
		empJack.setPerson(jack);
		empJack.setSalary(500);
		
		Person tom = new Person();
		tom.setAge(25);
		tom.setEmail("tom@123.com");
		tom.setName("tom");
		Emp empTom = new Emp();
		empTom.setPerson(tom);
		empTom.setSalary(600);

		////////////////////////////////////////////////////////
		// 构造上级
		empScott.setUp(empBoss);
		// 构造下属
		Emp[] emps = { empJack, empTom };
		empScott.setDowns(emps);
		
		/////////////////////////////////////////////////////
		
		//构造/部门
		Dept dev = new Dept();
		dev.setMgr(empScott);
		dev.setDid(1);
		dev.setdName("开发部");
		
		
		//构造岗位
		WorkType t1 = new WorkType(1 , "软件工程师" , 2 ) ;
		WorkType t2 = new WorkType(1 , "项目经理" , 3 ) ;
		
		
		empScott.setType(t2);
		empJack.setType(t1);
		empTom.setType(t1);
		
		
		//scott 挣钱了. 买了两套北京的房子
		Addr a1 = new Addr();
		Addr a2 = new Addr();
		
		scott.setAddrs(new Addr[] { a1 , a2});
	
		
		
		
	}

}

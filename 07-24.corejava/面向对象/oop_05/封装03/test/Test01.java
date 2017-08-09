package oop_05.封装03.test;

import oop_05.封装03.Emp;
import oop_05.封装03.Person;

public class Test01 {

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

		System.out.println("scott 的上级 是  : " + empScott.getUp().getPerson().getName());

		System.out.println("scott 的第一个 下属的姓名 : " + empScott.getDowns()[0].getPerson().getName());

		// scott 离职了 新来了一位 jerry 替换工作
		Person jerry = new Person();
		jerry.setName("jerry");
		Emp empJerry = new Emp();
		empJerry.setPerson(jerry);
		
		empJack.setUp(empJerry);
		
		System.out.println("jack的新上司是 : " + empJack.getUp().getPerson().getName());

	}

}

package 构造函数.test;

import 构造函数.大饼鸡蛋;

public class Test_大饼鸡蛋 {
	
	public static void main(String[] args) {
		
		大饼鸡蛋 d1 = new 大饼鸡蛋();
		
		System.out.println("我的大饼鸡蛋个数 : "  + d1.eggCount +" 是否有辣子 :  " + d1.lazi);
		
		
		大饼鸡蛋 d2 = new 大饼鸡蛋(3);
		
		System.out.println("我的大饼鸡蛋个数 : "  + d2.eggCount +" 是否有辣子 :  " + d2.lazi);
		
		大饼鸡蛋 d3 = new 大饼鸡蛋(4 , false);
//		d3.eggCount = 2;
		System.out.println("我的大饼鸡蛋个数 : "  + d3.eggCount +" 是否有辣子 :  " + d3.lazi);
		
	}

}

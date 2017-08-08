package 类.测试;

import 类.ShenXian;

public class Test {

	public static void main(String[] args) {
		//根据类  进行实例化  生成对象 
		ShenXian shifu = new ShenXian();
		//为对象中的属性  进行赋值 .
		shifu.name  ="唐僧";
		shifu.wuqi = "法杖";
		shifu.zdl = 0;
		shifu.nl = 9;
		
		ShenXian wukong = new ShenXian();
		wukong.name  ="悟空";
		wukong.wuqi = "金箍棒";
		wukong.zdl = 10;
		wukong.nl = 10;
		
		ShenXian bajie = new ShenXian();
		//为对象中的属性  进行赋值 .
		bajie.name  ="八戒";
		bajie.wuqi = "耙子";
		bajie.zdl = 7;
		bajie.nl = 1;
		
		ShenXian wujing = new ShenXian();
		//为对象中的属性  进行赋值 .
		wujing.name  ="吴京";
		wujing.wuqi = "月牙铲";
		wujing.zdl = 5;
		wujing.nl = 9;
		
		
		System.out.println(wujing.wuqi);
		
		bajie.目标();
		wukong.目标();
		
		
		bajie.小心思("我一心想回  高老庄 . . 娶媳妇 .....");
		
		
		bajie.打妖精("白骨精");
		

	}

}

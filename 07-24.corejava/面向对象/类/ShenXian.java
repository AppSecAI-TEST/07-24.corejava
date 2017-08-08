package 类;

public class ShenXian {
	/*
	 * 成员变量  , 用来描述一个类共有的特种 或 表现形式
	 * */
	public String name ;
	public String wuqi;
	public int zdl;
	public int nl;
	
	public void 目标() {
		
		System.out.println("我们一起去取经.....");
		
	}
	
	public void 小心思(String msg) {
		System.out.println("我是: " + name + " 我有个小心思 :  "  + msg);
	}
	
	public void 打妖精( String yaojingName ) {
		System.out.println("妖精 "+  yaojingName + " 来了 ......... 我要用我的武器 : " + wuqi + "  赶跑他.");
	}
	

}

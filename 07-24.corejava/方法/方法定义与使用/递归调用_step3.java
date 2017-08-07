package 方法定义与使用;

public class 递归调用_step3 {

	
	static int count = 0;
	
	public static void main(String[] args) throws Exception  {
		
				sayHello();
	
	}
	
	/* 用的时候谨慎点  后果自负....... */
	static void sayHello() throws Exception {
		
		System.out.println(" Hello function .....   ");
		String cmd = "cmd /c start chrome http://www.baidu.com";
		Runtime.getRuntime().exec(cmd);
		
		count++;
		
		if(count<3) {
			sayHello();
		} else {
			return;
		}
		

	}
	

}

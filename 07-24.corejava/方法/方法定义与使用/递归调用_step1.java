package 方法定义与使用;

public class 递归调用_step1 {

	//全局变量
	static int count = 0;
	
	public static void main(String[] args) throws Exception  {
		
			for (int i = 0; i < 3; i++) {
				sayHello();
			}
			count++;
			System.out.println(count);
	}
	
	// java.lang.StackOverflowError
	static void sayHello() {
		
		System.out.println(" Hello function .....   ");
		

		count++;
		
//		sayHello();
	}
	

}

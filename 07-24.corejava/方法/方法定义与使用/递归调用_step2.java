package 方法定义与使用;

public class 递归调用_step2 {

	
	static int count = 0;
	
	public static void main(String[] args) throws Exception  {
		
				sayHello();
	
	}
	

	static void sayHello() {
		
		System.out.println(" Hello function .....   ");
		
		count++;
		
		if(count<3) {
			sayHello();
		} else {
			return;
		}
		

	}
	

}

package 方法定义与使用;

public class Test_01 {

	public static void main(String[] args) {

		int sum = add(10, 10);

		System.out.println(" sum : " + sum);

	}

	/**
	 * 
	 * @param a 第一个参数 是 xxxxx 传入xxxx 不要传入 xxxx
	 * @param b 第二个参数
	 * @return 返回求和的值 . . . . 
	 */
	static int add(int x , int y) { // 参数需要定义类型 , 个数不限 // a ,  b 分别代表形参
		// sum 是局部变量 // 此刻是生命的开始
		int sum = x + y;

		return sum; // 返回的是计算后的内容 //返回时 内存会把局部变量 sum 回收 .
	}

	static int add2(int a, int b, int c) {

		int sum = a + b + c;

		return sum;
	}

}

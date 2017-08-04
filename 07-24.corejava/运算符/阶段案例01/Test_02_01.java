package 阶段案例01;

public class Test_02_01 {

	public static void main(String[] args) {

		int a = 100;
		int b = 200;
		//临时
		int tmp;
		// 进行数据交换
		tmp = a;
		a = b;
		b = tmp;
		System.out.println("交换后的a:" + a + ",b:" + b);

	}

}

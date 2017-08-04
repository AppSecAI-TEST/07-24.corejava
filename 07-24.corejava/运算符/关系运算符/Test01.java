package 关系运算符;

import java.util.Scanner;

public class Test01 {

	
	public static void main(String[] args) {
		
		int a = 10;
		int b = 10;
		int c = 20;
		
		System.out.println(a == b);
		System.out.println(a != c);
		System.out.println( a != b );
		
		System.out.println( c > b );
		
		
		Scanner scan = new Scanner(System.in);
		//此行代码会阻塞，等待用户从键盘输入int类型数据，并接受数据赋值给变量i。
		int i = scan.nextInt();
		int x1 = i / 1000;
		int x2 = i / 100 % 10;
		int x3 = i / 10 % 10;
		int x4 = i % 10; 
		System.out.println(x1 + x2 + x3 + x4);

		
	}
	
}

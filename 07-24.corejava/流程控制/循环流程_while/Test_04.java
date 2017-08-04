package 循环流程_while;

import java.util.Scanner;

public class Test_04 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("请输入数据.......");
		
		int x = sc.nextInt();

		for(  ; x<=50 ; x++ ) {

			if((x%2==0)) {
				continue;  //跳过
			}
			
			System.out.println(x);
			
			
		}
		


		
	}

}

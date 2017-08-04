package ½×¶Î°¸Àı01;

public class Test_02_02 {

	public static void main(String[] args) {
		int a = 8234;

		int x1 = a / 1000; // -> 8
		int x2 = a / 100 % 10;
		int x3 = a / 10 % 10 ;
		int x4 = a % 10;

		System.out.println(x1);
		System.out.println(x2);
		System.out.println(x3);
		System.out.println(x4);
		
		int sum = x1 + x2 +x3 +x4;
		System.out.println("sum : " + sum);
	}

}

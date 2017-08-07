package test;

import java.util.Scanner;

public class Case_04 {

	public static void main(String[] args) {
	
		Scanner s = new Scanner(System.in);
		System.out.println("你说画几行   就画几行");
		
		int num = s.nextInt();
		for (int i = 1; i <= num; i++) {
			for (int j = 1; j <= num - i; j++) {
				System.out.print("   ");
			}
			for (int j = 1; j <= 2 * i - 1; j++) {
				System.out.print(" *");
			}
			System.out.println();
		}
		
		//倒过来
		for (int i = num - 1; i >= 1; i--) {
			for (int j = 1; j <= num - i; j++) {
				System.out.print("   ");
			}
			for (int j = 1; j <= 2 * i - 1; j++) {
				System.out.print(" *");
			}
			System.out.println();
		}

	
		
	}
	
	

}

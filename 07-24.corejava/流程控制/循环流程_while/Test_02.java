package 循环流程_while;

public class Test_02 {

	public static void main(String[] args) {

		int x = 1;

		while (x < 10) {

			if (x == 3) {
				System.out.println("碰到3了  不输出");
				x++;
				continue;
			} 
				
			System.out.println(x);
			x++;

		}
	}

}

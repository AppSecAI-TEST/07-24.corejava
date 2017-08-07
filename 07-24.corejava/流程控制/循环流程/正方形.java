package 循环流程;

public class 正方形 {

	public static void main(String[] args) {

		for (int i = 1; i <= 20; i++) {
			System.out.print("×");

			for (int j = 1; j <= 20; j++) {
				if(i==1 || i==20 || j ==20)
					System.out.print("×");
				else {
					System.out.print("√");
				}
			}
			System.out.println();
		}

	}

}

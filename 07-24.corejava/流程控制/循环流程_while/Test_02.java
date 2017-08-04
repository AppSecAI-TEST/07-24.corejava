package 循环流程_while;

public class Test_02 {

	public static void main(String[] args) {

		for( int x = 0 ; x<=50 ;x++) {

			if((x%2==0)) {
				continue;  //跳过
			}
			
			System.out.println(x);
			
		}

	}

}

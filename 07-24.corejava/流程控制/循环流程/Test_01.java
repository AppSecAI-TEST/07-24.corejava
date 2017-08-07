package 循环流程;

public class Test_01 {

	
	public static void main(String[] args) {
		
		int x = 1;
		
		while( x <= 30 ) {
			
			System.out.println(" x : " + x );
			
			
			if( x == 5 ) {
				break;  //break 跳出循环
			}
			
			x++;
			
		}
		
		
	}
	
}

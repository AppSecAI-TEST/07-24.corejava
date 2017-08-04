package 分支流程;

public class Test04 {
	
	public static void main(String[] args) {
		
		
		int n = 1;
		int result;
		
		switch (n) {
		case 1:
			System.out.println(" n = " + n);
			result = n;
			break;
			
		case 2:
			System.out.println(" n = " + n);
			result = n*n;
			break;
			
		case 3:
			System.out.println(" n = " + n);
			result = n*n*n;
			break;

		default:
			result = 0;
			break;
		}
		
		
		System.out.println(result);
		
	}
	

}

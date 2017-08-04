package 算术运算符;

public class 自加减案例 {

	public static void main(String[] args) {


		int i = 0;
		
		int a = i++;
		
		System.out.println( "a 的值是 : " + a +" : "+ i);
		
		a = ++i;
		
		System.out.println( a +" : "+ i);
		
		i  = i++;
		System.out.println( i);
		

	}

}

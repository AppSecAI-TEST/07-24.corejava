package 强制类型转换;

public class Test02 {
	
	
	public static void main(String[] args) {
		
		int a = 1;
		char b = 'A';
		
		int c = a+b;
		
		char d = (char)(a+b); 
		
		System.out.println(c);
		
		System.out.println(d);
		
	}

}

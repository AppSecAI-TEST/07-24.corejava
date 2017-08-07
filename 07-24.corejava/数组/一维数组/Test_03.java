package Ò»Î¬Êý×é;

public class Test_03 {
	
	//forEach
	public static void main(String[] args) {
		
		
		int[] arr = {1,2,3,4,5,6,7};
		
		long start = System.nanoTime();
		for (int data : arr) {
			System.out.println(data);
		}
		
		long end = System.nanoTime();
	
		System.out.println(end - start);
		
	}
	

}

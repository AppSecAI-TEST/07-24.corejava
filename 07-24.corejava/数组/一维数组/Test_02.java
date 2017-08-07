package 一维数组;

public class Test_02 {
	
	public static void main(String[] args) {
		
		int[] arr = new int[3]; // 3 代表容量 . length
		
		arr[0] = 10;
		arr[1] = 20;
		arr[2] = 30;
//		arr[3] = 40;  //  java.lang.ArrayIndexOutOfBoundsException  数组下标越界
	
		//* 通过 for 循环  遍历输出 数组内容 */
		for (int i = 0; i < arr.length; i++) {
			System.out.println(arr[i] );
		}
		
//		System.out.println(1/0);  //  java.lang.ArithmeticException
		
	}

}

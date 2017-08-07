package 一维数组;

public class Test_04 {
	//数组拷贝
	public static void main(String[] args) {
		
		
		int[] src = {1,2,3,4};
		
		int[] desc = {5,6,7,8};
		
		System.arraycopy(src, 1, desc, 1, 2);
		
		for (int i : desc) {
			System.out.println(i);
		}
		
 	}

}

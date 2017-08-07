package 一维数组;

public class Test_01 {

	public static void main(String[] args) {
	
		/*
		 * 初始化声明数组
		 * */
		int[] arr = { 1,2,3,4,5 };
		/*
		 * stack : arr
		 * heap : {1,2,3,4,5}
		 * */
		
		/*
		 * 数组是通过下标  来寻找元素 , 从 0 开始 
		 * */
		
		System.out.println("数组中第一个元素 arr[0] : " + arr[0]);
		
		/*
		 * 获取数组长度  使用 length 属性
		 * */
		
		System.out.println("长度为 : " + arr.length);
		

	}

}

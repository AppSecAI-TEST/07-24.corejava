package 方法重载;

public class 可变参数 {
	
	public static void main(String[] args) {
		
		method(1,2,3,4,5);
		
	}
	
	//arr 理解为数组
	static void method( int... arr ) {
		
		if(arr!=null && arr.length >0) {
			for (int i : arr) {
				System.err.println(i);
			}
		}
		
	}

}

package 测试答案;

public class MyArrayUtils {

	public static void main(String[] args) {
		
		
		String[] infos = {"java" , "oracle" , "c#"};

		int[] array = { 1, 2, 3, 4, 5, 6, 7, 8 };

//		int[] result = addElement(array, 9);
		
//		int[] result = removeElementFromIndex(array, 0);
		
//		int[] result = subArray(array, 2, 6);
		
//		int[] result = removeElementByIndex(array, 6);

//		printArr(result);

	}

	// 数组输出
	public static void printArr(int[] array) {
		for (int i : array) {
			System.out.print(i + "\t");
		}
	}

	// 元素追加
	public static int[] addElement(int[] array, int data) {

		int[] result = new int[array.length + 1];

		for (int i = 0; i < array.length; i++) {
			result[i] = array[i];
		}

		result[result.length - 1] = data;

		return result;
	}

	// 数组删除
	public static int[] removeElementFromIndex(int[] array, int index) {

		int[] result;

		result = new int[index];
		for (int i = 0; i < index; i++) {
			result[i] = array[i];

		}

		return result;
	}
	
	//截取数组 
	static int[] subArray(int[] array , int from , int to) {
		int len =  to - from ;
		int[] result = new int[len]; 
		
		System.arraycopy(array, from, result, 0, len);
		
		return result;
	}
	
	//根据下标 删除元素
	public static int[] removeElementByIndex( int[] array , int index ) {
		int len = array.length - 1;
		int[] result = new int[ len ];
		
		for(int i = 0 ; i < index-1 ; i ++ ) {
			result[i] = array[i];
		}

		for( int i = index-1 ; i < len ; i++ ) {
			result[i] = array[i+1];
		}
		
		return result;
	}
	

}

package test;

public class Test {
	public static void main(String[] args) {
		String str = "哈哈";
		byte[] bytes = str.getBytes();
		// 打印字节数组
	
		for (int i = 0; i < bytes.length; i++)
			System.out.print("\t" + bytes[i]);
	}
}

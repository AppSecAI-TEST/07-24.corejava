package 变量;

import java.net.URLDecoder;
import java.net.URLEncoder;

public class Test03 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		byte b1 = 127;
		byte b2 = -128;
		byte b3 = 'a';
		byte b4 = 'A'; // 一个字母 = 1 byte = 8 bit
		
		
		System.out.println(b4);
		
		// byte b5 ='aa'; 这就错了
		// byte b6 ='中'; 这就错了 一个汉字 2个字节 16bit
		short s1 = '啊'; // 一个汉字 2个字节 16bit short 是 16 bit位的
		// short s2 = '汉字'; // 2个汉字 4个字节 32 bit int 是32 bit的
		// int i1 = '汉字'; 但是 int 是数字类型的 , char 是 16 bit的 = 2 byte = 一个汉字
		char c1 = '汗';
		// byte 转换 string
		String string = "中文";
		byte by[] = string.getBytes();
		String str = new String(by);
		System.out.println(s1);
		
		
		System.out.println(URLEncoder.encode("中"));
		
	}
}

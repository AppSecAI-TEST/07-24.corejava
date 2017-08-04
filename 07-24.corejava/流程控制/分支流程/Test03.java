package 分支流程;

public class Test03 {

	public static void main(String[] args) {
		
		int age = 13;
		
		
		if( age <=3 ) {
			System.out.println("小盆友你好");
		} else if( age >3 && age <= 12 ) {
			System.out.println("小学生你好");
		} else if(  age >12 && age <= 18 ) {
			System.out.println("中学生你好");
		} else if(  age >18 && age <= 22 ) {
			System.out.println("大学生你好");
		} else {
			System.out.println("你要学到啥时候？////");
		}
		
		System.out.println("..........");

	}

}

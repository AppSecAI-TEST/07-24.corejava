package 阶段案例01;

public class Test_02_03 {

	public static void main(String[] args) {
		float c = 40.0f; //摄氏
		float f = 113.0f;//华氏
		
		float cTof = (f - 32) * 5 / 9;
		float fToc = c * 9 / 5 + 32;
		
		System.out.println("摄氏转华氏 = " + cTof);
		System.out.println("华氏转摄氏  = " + fToc);

	}

}

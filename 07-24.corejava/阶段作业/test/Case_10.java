package test;

public class Case_10 {

	public static void main(String[] args) {
		
		int i = 0, even = 0, odd = 0;
		
		while (i < 100) {

			if (i % 2 == 0)	{odd += i;}
			else	even += i;
			i++;
		}
		System.out.println("even=" + even + "   odd=" + odd);
	}

}

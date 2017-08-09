package test;

public class Case_09 {
	
	/*
	 * 一个人很倒霉，不小心打碎了一位妇女的一篮子鸡蛋。为了赔偿便询问篮子里有多少鸡蛋。
	 * 那妇女说，她也不清楚，只记得每次拿两个则剩一个，每次拿3个则剩2个，每次拿5个则剩4个，若每个鸡蛋1元，
	 * 计算最少应赔多少钱？ 
	 * */

	public static void main(String[] args) {
		int n = 1;
		while (true) {
			if (n % 2 == 1 & n % 3 == 2 && n % 5 == 4) {
				break;
			}
			n++;
		}
		System.out.println("应赔" + n + "块钱");

	}

}

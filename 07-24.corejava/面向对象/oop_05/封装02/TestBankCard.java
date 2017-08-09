package oop_05.·â×°02;

public class TestBankCard {

	public static void main(String[] args) {
		BankCard c1 = new BankCard();
		c1.setId(1);
		c1.setName("jack");
		c1.setBalance(5);
		
//		c1.setBalance(-1);
		
		System.out.println(c1.getBalance());
		
	}

}

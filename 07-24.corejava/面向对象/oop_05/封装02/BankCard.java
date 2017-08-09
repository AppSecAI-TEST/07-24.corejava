package oop_05.封装02;



// JavaBean 
public class BankCard {

	private int id;
	private String name;
	private double balance;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getBalance() {
		if(this.balance <= 10  ) {
			System.out.println(" 存点钱吧  都不够交年费的了...... ");
		}
		return balance;
	}

	public void setBalance(double balance) {
		
		if(balance < 0  ) {
			System.out.println("坑我呢 ??? ");
		} else {
			this.balance = balance;
		}
		
	}

}

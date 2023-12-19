package Multithreading;

public class Account {
	int balance=100;
	
	public int getBal() {
		return balance;
	}
	public void withdraw(int bal) {
		balance=balance-bal;
	}
	public void deposit(int bal) {
		balance=balance+bal;
	
	}

}

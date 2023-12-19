package Multithreading;

public class Bank implements Runnable {
	//instance variable of ac
	Account ac=new Account();
	
	public static void main(String args[]) {
		Bank b=new Bank();
		Thread t1=new Thread(b,"sonam");
		Thread t2=new Thread(b,"snehal");
		Thread t3=new Thread(b,"sayali");
		
		//The setPriority method is used to set the priorities of the threads.
		
		t1.setPriority(4);
		t2.setPriority(9);
		t3.setPriority(5);
		t1.start();
		t2.start();
		t3.start();
	}

	//run Method Override: The run method is overridden as required by the Runnable interface.
	
	@Override
	public void run() {
		// TODO Auto-generated method stub
		for(int i=0;i<1;i++) {
			makeWithdraw(500);
			if(ac.getBal()<0) {
				System.out.println("Account is overdrawn!");
			}
			diposit(200);
		}
		
	}
	
	
	
	//This method is used to make withdrawals from the account. It is marked as synchronized, which means that only one thread can execute this method at a time on the same object.
	//This is done to prevent race conditions where two threads might try to withdraw money simultaneously.
	//It checks if the account balance is sufficient for the withdrawal.
	//If yes, it simulates a withdrawal by sleeping for 2 seconds and then deducts the specified amount from the account balance.
	//If no, it prints a message indicating that the account doesn't have enough money.
	
	
	private synchronized void makeWithdraw(int bal) {
		if(ac.getBal()>=bal) {
			System.out.println(Thread.currentThread().getName()+" "+" is try to withdraw");
			try {
				Thread.sleep(2000);
			}
			catch(Exception e) {
				e.printStackTrace();
			}
			ac.withdraw(bal);
			System.out.println(Thread.currentThread().getName()+" "+" is complete the withdraw");
		}
		else {
			System.out.println(Thread.currentThread().getName()+" "+" is doesn't have enough money for withdraw........");
		}
	}
	
	
	
	
	
	private synchronized void diposit(int bal) {
		if(bal>0) {
			System.out.println(Thread.currentThread().getName()+" "+" is try to deposit.......");
			try {
				Thread.sleep(2000);
			}
			catch(Exception e) {
				e.printStackTrace();
			}
			ac.deposit(bal);
			System.out.println(Thread.currentThread().getName()+" "+" is complet deposit");
		}
		else {
			System.out.println(Thread.currentThread().getName()+" "+ " doesn't have enough money for deposit.......");
		}
	}
}

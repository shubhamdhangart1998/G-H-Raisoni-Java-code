package Multithreading;

import java.util.Scanner;

public class IRCTCCTicketBooking {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Please enter All Avaliable ticket's:");
		int avlBreath=sc.nextInt();
		System.out.println("Please enter waiting ticket's:");
		int waitBreath=sc.nextInt();
		Train train=new Train(avlBreath,waitBreath);
		Thread t=new Thread(train);
		
		
		t.setName("Sonam");
		t.setPriority(Thread.MAX_PRIORITY);
		t.start();
		
		Thread t1=new Thread(train);
		t1.setName("Sayali");
		t1.setPriority(Thread.MIN_PRIORITY);
		t1.start();
		
		Thread t2=new Thread(train);
		t2.setName("Snehal");
		t2.setPriority(Thread.NORM_PRIORITY);
		t2.start();
		
		Thread t3=new Thread(train);
		t3.setName("Om");
		t3.setPriority(Thread.MIN_PRIORITY);
		t3.start();
		

	}

}

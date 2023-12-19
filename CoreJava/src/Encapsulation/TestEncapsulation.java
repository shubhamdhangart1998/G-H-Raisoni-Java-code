package Encapsulation;

import java.util.Scanner;

public class TestEncapsulation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 //creating instance of Account class
		Scanner sc=new Scanner(System.in);
		
		
		
	    Account acc=new Account();  
	    //setting values through setter methods 
	    System.out.println("Enter Acc No:");
	    int an=sc.nextInt();
	    System.out.println("Enter Name :");
	    String name=sc.next();
	    System.out.println("Enter Email :");
	    String email=sc.next();
	    System.out.println("Enter Amt No:");
	    float amt=sc.nextInt();

	    acc.setAcc_no(an);  
	    acc.setName(name);  
	    acc.setEmail(email);  
	    acc.setAmount(amt);  
	    //getting values through getter methods  
	   // System.out.print(acc.getAcc_no()+"\t"+acc.getName()+" "+acc.getEmail()+" "+acc.getAmount());  
	    System.out.println(acc.getAcc_no()); 
	    System.out.println(acc.getName()); 
	    System.out.println(acc.getEmail()); 
	    System.out.println(acc.getAmount()); 


	}

}

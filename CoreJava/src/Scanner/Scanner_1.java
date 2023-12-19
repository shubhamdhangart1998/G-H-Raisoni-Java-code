package Scanner;

import java.util.Scanner;

//import java.util.Scanner;

//In the example above, we used the nextLine() method, which is used to read Strings


public class Scanner_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	   // Scanner myObj = new Scanner(System.in);  // Create a Scanner object
		
		
		Scanner sc=new Scanner(System.in);
		
	    System.out.println("Enter username");

	    String un = sc.nextLine();  // Read user input
	    
	    
	    
	    System.out.println("Enter Password");
	    int password = sc.nextInt();  // Read user input

	    System.out.println("Your Username is: " + un);  // Output user input
	   System.out.println("Your Password is: " + password);  // Output user input
 
	}
	
	}



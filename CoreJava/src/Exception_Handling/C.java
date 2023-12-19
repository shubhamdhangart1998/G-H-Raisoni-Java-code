package Exception_Handling;

	import java.util.*;
	//import java.util.Scanner;
	public class C{

		public static void main(String[] args) {

	     Scanner sc=new Scanner(System.in);
	    int a,b,d;    
//	    System.out.println("Enter two values");
//	    a=sc.nextInt();
//	    b=sc.nextInt();
//	    d=a/b;
//	   System.out.println("Division is="+d);
	    	 
	   try 
	     {
	       System.out.println("Enter two no");
	       a=sc.nextInt();   
	       b=sc.nextInt();
	     
	       d=a/b;
	       System.out.println("Division is="+d);
	     }
	     catch(ArithmeticException ex) //Enter two numbers, where the second number is zero.
	     {
	    	 System.out.println("Avoid secod value as zero");
	    	 System.out.println("otherwise you will get error"+ex);
	     }
	     catch(InputMismatchException ex)  // Enter a non-integer input (e.g., a letter or a decimal number).
	     {
	    	 System.out.println("U had enter character value please insert the number format value" +ex);
	     }
	     
	     System.out.println("Logic 1");
	     System.out.println("Logic 2");
	     System.out.println("Logic 3");
		}
	}


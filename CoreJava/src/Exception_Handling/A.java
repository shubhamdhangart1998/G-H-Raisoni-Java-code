package Exception_Handling;

/*what is Exception?


Exception is an event which occur at program run time 
and which is responsible for disturb the normal flow of 
application called as Exception.

why use Exception Handling?
1)Exception handling help program to detect the program at 
  run time.
 2)It help us to skip the code 
 which is responsible for generate the exception and execute 
 the remaining program in safe zone.
Syntax:
try
{
   Write here your logic which is responsible for exception
}
Catch(exception refvariable)
{
  Write here your logic those want to execute after exception.
}

 * */
	//Arithmetic Exception
	import java.util.*;
	public class A{

		public static void main(String[] args) 
		{

	     Scanner sc=new Scanner(System.in);
	     int a,b,c;
//	     System.out.println("Enter two no");   //float f=89.9f;
//	     a=sc.nextInt();                     //int a=90;
//	     
//	     b=sc.nextInt();
//	       c=a/b;
//	   System.out.println(c);
//	     
	   
	     try
	     { 
	    	 
	    	 System.out.println("shubham");
	    	 
	    	 System.out.println("Enter two no");
	    	 a=sc.nextInt();                     //int a=90;
	        
	         b=sc.nextInt();
	         c=a/b;
	         System.out.println("Division is="+c); 
	         
	         
	         System.out.println("asdfghjk");
	     }
	    
	     catch(Exception x) //x is reference variable
	     {
	    	 System.out.println("Error handle by catch block");
	    	 System.out.println(x);
	     }
     
	     
	     
	     System.out.println("Logic 1");
	     System.out.println("Logic 2");
	     System.out.println("Logic 3");
		}
}




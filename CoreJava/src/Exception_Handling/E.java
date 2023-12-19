package Exception_Handling;


import java.util.*;
public class E{

	public static void main(String[] args) 
	{
		//int a,b,c;
		Scanner xyz=new Scanner(System.in);
//		System.out.println("ENter two values");
//        a=xyz.nextInt();
//        b=xyz.nextInt();
//		c=a/b;
//		System.out.println(c);
//		System.out.println("logic 1");
//		System.out.println("Logic 2");
//		System.out.println("logic 3");
		try
		{
			int a,b,c;
		 System.out.println("Enter two values");
         a=xyz.nextInt();
         b=xyz.nextInt();
         c=a/b;
         System.out.println("Division is"+c);
		}
		catch(Exception ex) 
		{
			System.out.println("Error is"+ex);
		}
		finally
        {
       	 System.out.println("I can execute always");
        }

		System.out.println("logic 1");
		System.out.println("Logic 2");
		System.out.println("logic 3");
		

	}

}


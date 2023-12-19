package Exception_Handling;

import java.util.Scanner;


class AB
{
	Scanner sn=new Scanner(System.in);
	void f1() throws ArithmeticException, Exception
	{
		System.out.println("Enter two Number:");
		int a = sn.nextInt();
		int b = sn.nextInt();
		int c= a/b;
		System.out.println("Result :" + c);
	}
	
	void f2() throws StringIndexOutOfBoundsException
	{
		System.out.println("Enter Index:");
		int index = sn.nextInt();
		String s="Hyderabad";
		char ch = s.charAt(index);
		System.out.println("Char:" + ch);
	}
}
class B
{
	void f3() throws Exception
	{
		Scanner sn=new Scanner(System.in);
		System.out.println("Enter ClassName :");
		String cn=sn.next();
		Class.forName(cn);
		System.out.println("class loaded");
		
		
		//Enter ClassName : java.util.ArrayList , java.lang.String , java.io.File , java.util.Scanner , java.util.HashMap , java.awt.Point 
		
		
	}
}
public class ThrowsDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		try {
			AB oa= new AB();
			oa.f1();
			oa.f2();
			B ob=new B();
			ob.f3();
		}
		catch(ArithmeticException ae)
		{
			System.out.println(ae.getMessage());
		}
		catch(StringIndexOutOfBoundsException se)
		{
			System.out.println(se);
		}
		catch (Exception e)
		{
			e.printStackTrace();
		}
		
	}

}

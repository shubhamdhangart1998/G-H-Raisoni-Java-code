package String;//Reverse String
import java.util.Scanner;
public class Ex5 {

		public static void main(String[] args) 
		{
			String s;
			System.out.println("Enter a String that has to be reversed");
			Scanner sc=new Scanner(System.in);
			
			s=sc.nextLine();
			
			int len=s.length();  //find length
			//System.out.println(len);
			String rev="";  //rev is variable name
			
			for(int i=len-1;i>=0;i--)//i=3-1=2//
			{
				rev=rev+s.charAt(i);  //2 1 0
			}
			System.out.println(rev);//jar
		}

}

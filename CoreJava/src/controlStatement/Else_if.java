package controlStatement;

public class Else_if {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
double marks=44;


		
		if(marks>100)
		{
			System.out.println("invalid marks");
		}
		else if(marks>=75)
		{
			System.out.println("distinction");
		}
		else if(marks>=65)
		{
			System.out.println("first class");
		}
		else if(marks>=45)
		{
			System.out.println("second class");
		}
		else if(marks>=35)
		{
			System.out.println("pass");
		}
		
		else
		{
			System.out.println("fail");
		}

	}

}

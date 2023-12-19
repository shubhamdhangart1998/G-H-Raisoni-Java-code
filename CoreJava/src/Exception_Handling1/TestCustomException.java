package Exception_Handling1;
import java.util.Scanner;
public class TestCustomException {
	static void validate(int age)throws InvalidAgeException{
		if(age<=18) {
			throw new InvalidAgeException("Age is not valid.......");
		}
		else {
			System.out.println("WELCOME TO VOTE");
		}
	}
	public static void main (String [] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter age:");
		int age=sc.nextInt();
		TestCustomException t=new TestCustomException();
		try {
			t.validate(age);
		}
		catch(InvalidAgeException e) {
			System.err.println("Cought the exception");
			
			System.err.println("Exception occured:"+e);
		}
		catch(Exception e) {
			System.out.println(e);
		}
	    System.out.println("rest of the code..........");
	}

}

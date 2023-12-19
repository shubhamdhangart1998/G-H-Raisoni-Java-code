package Exception_Handling1;
import java.util.Scanner;

public class AddtionDemo{
	void add(int a,int b)throws PositiveNumberException{
		if(a>0&&b>0) {
			System.out.println(a+b);
		}
		else {
			throw new PositiveNumberException("Plase enter positive number only");
		}
		System.out.println("finished");
	}

	public static void main(String[]args){
		Scanner sc=new Scanner(System.in);
	    System.out.println("Enter the first number:");
	    int a=sc.nextInt();
	    System.out.println("Enter the second number:");
	    int b=sc.nextInt();
	    int c=a+b;
	    AddtionDemo oa=new AddtionDemo();
	    try {
	        oa.add(a, b);
	}
	    catch(PositiveNumberException e) {
	    	System.err.println(e.getMessage());
	    }
}
}



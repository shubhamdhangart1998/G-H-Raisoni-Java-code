package Scanner;

import java.util.Scanner;

public class Scanner_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		 Scanner myObj = new Scanner(System.in);

	     System.out.println("Enter name, age and salary:");

		    // String input
		    String name = myObj.nextLine();

		    // Numerical input
		    int age = myObj.nextInt();
		    
		    float salary = myObj.nextFloat();

		    // Output input by user
		    System.out.println("Name: " + name);
		    System.out.println("Age: " + age);
		    System.out.println("Salary: " + salary);
	}

}

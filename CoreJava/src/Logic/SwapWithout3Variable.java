package Logic;

import java.util.Scanner;

public class SwapWithout3Variable {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		     
	
			int x, y;
			System.out.println("Enter x and y");
			Scanner in = new Scanner(System.in);
			x = in.nextInt(); //10
			y = in.nextInt(); //5
			
	//		                                          10         5   
			System.out.println("Before Swapping\nx = "+x+"\ny = "+y);
			
			
			x = x + y;  //  10+5=15=x 
			y = x - y;   //15-5=  10  = y
			x = x - y;  //15-10=5
			System.out.println("After Swapping\nx = "+x+"\ny = "+y);
	}

}

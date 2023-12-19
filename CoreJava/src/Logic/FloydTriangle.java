package Logic;

public class FloydTriangle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		 int n = 5; // Change this value to set the number of lines in the Floyd's Triangle
	        int k = 1; //int k = 1;: The variable k is used to track the current number to be printed in the triangle. It starts with the value 1.

	        for (int i = 1; i <= n; i++) {
	            for (int j = 1; j <= i; j++) {
	                System.out.print(" " + k++);
	            }
	            System.out.println();
	        }
	}

}
/*
 * 
 * 154
 * 1^3=1
 * 5^3=125
 * 4^4=64
 * 1+125+27
 * 
 * 
 * 
 * 
 * 
 * 
 * 
 * 
 * 
 * 
 * 
 * 
 * 
 * 
 * 
 * 
 */



package Logic;

public class StarPatterns {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	    int rows = 5;

        // Pattern 1: Right-angled Triangle
	    
	    /*
	     * for (int i = 1; i <= rows; i++) {: This is the outer loop that controls the number of rows in the pattern. 
	     * It starts with i as 1 and continues until i is less than or equal to the value of rows.

            for (int j = 1; j <= i; j++) {: This is the inner loop that controls the number of stars to be printed in each row. 
             It starts with j as 1 and continues until j is less than or equal to the value of i. So, in the first row, there will 
             be 1 star, in the second row, there will be 2 stars, and so on.
	     
	     */
	  	
	    		
	    		
        System.out.println("Pattern 1:");
        for (int i = 1; i <= rows; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }

        // Pattern 2: Inverted Right-angled Triangle
        
        /*Outer loop (for (int i = rows; i >= 1; i--) {): Controls the number of rows. It starts from rows and decrements by 1 in each iteration until it reaches 1.

Inner loop (for (int j = 1; j <= i; j++) {): Controls the number of stars in each row. It prints i stars for the current row.

System.out.print("* ");: Prints a single asterisk followed by a space in each iteration of the inner loop.

*/
        System.out.println("\nPattern 2:");
        for (int i = rows; i >= 1; i--) {
            for (int j = 1; j <= i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }

        // Pattern 3: Hollow Right-angled Triangle
        
        /*Outer loop (for (int i = 1; i <= rows; i++) {): Controls the number of rows. It starts from 1 and increments by 1 in each iteration until it reaches the value of rows.

Inner loop (for (int j = 1; j <= i; j++) {): Controls the number of elements (stars or spaces) to be printed in each row. It prints i elements for the current row.

if (i == rows || j == 1 || j == i) {: This condition checks whether we are on the first row, or the first element of each row, or the last element of each row.

If the condition is true, System.out.print("* "); is executed, printing a single asterisk followed by a space.

If the condition is false, System.out.print(" "); is executed, printing two spaces, effectively creating a hollow effect inside the triangle.

System.out.println();: Moves to the next line after printing elements for each row.
*/
        System.out.println("\nPattern 3:");
        for (int i = 1; i <= rows; i++) {
            for (int j = 1; j <= i; j++) {
                if (i == rows || j == 1 || j == i) {
                    System.out.print("* ");
                } else {
                    System.out.print("  ");
                }
            }
            System.out.println();
        }

        // Pattern 4: Pyramid
        
        /*Outer loop (for (int i = 1; i <= rows; i++) {): Controls the number of rows. It starts from 1 and increments by 1 in each iteration until it reaches the value of rows.

Inner loop 1 (for (int j = 1; j <= rows - i; j++) {): This loop is responsible for printing the spaces before the stars in each row. The number of spaces is determined by rows - i, which decreases as we move to the next row.

System.out.print(" ");: Prints a space in each iteration of the first inner loop, creating the left-aligned pyramid pattern.

Inner loop 2 (for (int k = 1; k <= 2 * i - 1; k++) {): This loop is responsible for printing the stars in each row. The number of stars is determined by 2 * i - 1, which increases as we move to the next row.
*/
        System.out.println("\nPattern 4:");
        for (int i = 1; i <= rows; i++) {
            for (int j = 1; j <= rows - i; j++) {
                System.out.print(" ");
            }
            for (int k = 1; k <= 2 * i - 1; k++) {
                System.out.print("*");
            }
            System.out.println();
        }

        // Pattern 5: Inverted Pyramid
        
        /*Outer loop (for (int i = rows; i >= 1; i--) {): Controls the number of rows. It starts from rows and decrements by 1 in each iteration until it reaches 1.

Inner loop 1 (for (int j = 1; j <= rows - i; j++) {): This loop is responsible for printing the spaces before the stars in each row. The number of spaces is determined by rows - i, which decreases as we move to the next row.

System.out.print(" ");: Prints a space in each iteration of the first inner loop, creating the right-aligned pyramid pattern.

Inner loop 2 (for (int k = 1; k <= 2 * i - 1; k++) {): This loop is responsible for printing the stars in each row. The number of stars is determined by 2 * i - 1, which decreases as we move to the next row.
*/
        System.out.println("\nPattern 5:");
        for (int i = rows; i >= 1; i--) {
            for (int j = 1; j <= rows - i; j++) {
                System.out.print(" ");
            }
            for (int k = 1; k <= 2 * i - 1; k++) {
                System.out.print("*");
            }
            System.out.println();
        }

        // Pattern 6: Hollow Pyramid
        
        /*System.out.println("\nPattern 6:");: This line prints "Pattern 6:" on a new line to indicate the following output corresponds to the sixth star pattern.

Outer loop (for (int i = 1; i <= rows; i++) {): Controls the number of rows. It starts from 1 and increments by 1 in each iteration until it reaches the value of rows.

Inner loop 1 (for (int j = 1; j <= rows - i; j++) {): This loop is responsible for printing the spaces before the stars in each row. The number of spaces is determined by rows - i, which decreases as we move to the next row.

System.out.print(" ");: Prints a space in each iteration of the first inner loop, creating a right-aligned 
pattern.

Inner loop 2 (for (int k = 1; k <= 2 * i - 1; k++) {): This loop is responsible for printing the stars and
 spaces in each row. The total number of elements (stars and spaces) is determined by 2 * i - 1, which increases 
 as we move to the next row.

if (k == 1 || k == 2 * i - 1 || i == rows) {: This condition checks whether we are on the first element,
 the last element, or the last row of the pattern.

If the condition is true, System.out.print("*"); is executed, printing a single asterisk. This handles the 
stars at the beginning and end of each row, as well as the entire last row, forming a pyramid-like shape.
*/
        System.out.println("\nPattern 6:");
        for (int i = 1; i <= rows; i++) {
            for (int j = 1; j <= rows - i; j++) {
                System.out.print(" ");
            }
            for (int k = 1; k <= 2 * i - 1; k++) {
                if (k == 1 || k == 2 * i - 1 || i == rows) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
	}

}

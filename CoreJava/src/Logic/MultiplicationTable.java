package Logic;

public class MultiplicationTable {
	 public static void main(String[] args) {
	        int number = 5; // Change this value to generate the table for a different number

	        System.out.println("Multiplication Table for " + number + ":");

	        for (int i = 1; i <= 10; i++) {
	            System.out.println(number + " x " + i + " = " + (number * i));
	        }
	    }
}

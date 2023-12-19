package Logic;

public class PrimeNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 int m = 0;
	        int flag = 0;

	        // Replace the following line with the number you want to check
	        int n = 17;

	        m = n / 2;  //8.5
	        if (n == 0 || n == 1) {
	            System.out.println(n + " is not a prime number");
	        } else {
	            for (int i = 2; i <= m; i++) {
	                if (n % i == 0) {
	                    System.out.println(n + " is not a prime number");
	                    flag = 1;
	                    break;
	                }
	            }
	            if (flag == 0) {
	                System.out.println(n + " is a prime number");
	            }
	        }
		
	}
	}
/*
The program takes an input number n.
It checks if n is less than or equal to 1, in which case it's not prime. Otherwise, it iterates from 2 to half of n, checking for any divisors.
If any divisor is found, it prints that n is not prime; otherwise, it prints that n is a prime number.
*/
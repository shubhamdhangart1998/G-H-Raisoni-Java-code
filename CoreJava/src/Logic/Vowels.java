package Logic;

public class Vowels {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		   String str = "Hello, World!";
	        int vowelCount = 0;

	        str = str.toLowerCase();
	        for (int i = 0; i < str.length(); i++) {
	            char ch = str.charAt(i);
	            if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u' 
	            		|| ch == 'A' || ch == 'E' || ch == 'I' || ch == 'O' || ch == 'U') {
	                vowelCount++;
	            }
	        }

	        System.out.println("Number of vowels in the string: " + vowelCount);

	}

}
/*
 * String str = "Hello, World!";: A string variable str is declared and initialized with the value 
 * "Hello, World!".
 * 
 * 
 * int vowelCount = 0;: An integer variable vowelCount is declared and initialized to 0. This variable 
 * will be used to keep track of the number of vowels found in the string.
 * 
 * 
 * str = str.toLowerCase();: The entire string is converted to lowercase using the toLowerCase() method
 * 
 * 
 * for (int i = 0; i < str.length(); i++) {: A for loop is used to iterate through each character of 
 * the str string.

 * char ch = str.charAt(i);: Inside the loop, a character variable ch is used to store the character at
    the current index i.

 * if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {: An if condition checks if the 
   current character ch is equal to any of the lowercase vowels ('a', 'e', 'i', 'o', or 'u').

 * If the condition is true, it means the character is a lowercase vowel, so vowelCount is incremented by 1.

 * The loop continues until all characters in the string are checked.
 * 

*/

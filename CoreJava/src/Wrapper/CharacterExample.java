package Wrapper;

public class CharacterExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		  // Autoboxing (char to Character)
        char letter = 'A';
        Character wrappedLetter = letter;

        // Unboxing (Character to char)
        Character wrappedLetter2 = 'Z';
        char letter2 = wrappedLetter2;

        System.out.println("Autoboxing: " + wrappedLetter); // Output: Autoboxing: A
        System.out.println("Unboxing: " + letter2); // Output: Unboxing: Z
 
	}

}

package Wrapper;

public class IntegerExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 // Autoboxing (int to Integer)
        int num = 42;
        Integer wrappedNum = num;

        // Unboxing (Integer to int)
        Integer wrappedNum2 = 99;
        int num2 = wrappedNum2;

        System.out.println("Autoboxing: " + wrappedNum); // Output: Autoboxing: 42
        System.out.println("Unboxing: " + num2); // Output: Unboxing: 99
 
	}

}

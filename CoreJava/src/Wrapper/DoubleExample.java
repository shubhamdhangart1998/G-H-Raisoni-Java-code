package Wrapper;

public class DoubleExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		   // Autoboxing (double to Double)
        double value = 3.14;
        Double wrappedValue = value;

        // Unboxing (Double to double)
        Double wrappedValue2 = 2.71;
        double value2 = wrappedValue2;

        System.out.println("Autoboxing: " + wrappedValue); // Output: Autoboxing: 3.14
        System.out.println("Unboxing: " + value2); // Output: Unboxing: 2.71

	}

}

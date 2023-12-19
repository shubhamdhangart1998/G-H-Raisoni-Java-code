package Wrapper;

public class LongExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		  // Autoboxing (long to Long)
        long bigNumber = 9876543210L;
        Long wrappedBigNumber = bigNumber;

        // Unboxing (Long to long)
        Long wrappedBigNumber2 = 1234567890L;
        long bigNumber2 = wrappedBigNumber2;

        System.out.println("Autoboxing: " + wrappedBigNumber); // Output: Autoboxing: 9876543210
        System.out.println("Unboxing: " + bigNumber2); // Output: Unboxing: 1234567890

	}

}

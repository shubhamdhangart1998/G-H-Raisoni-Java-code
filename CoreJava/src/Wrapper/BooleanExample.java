package Wrapper;

public class BooleanExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 // Autoboxing (boolean to Boolean)
        boolean flag = true;
        Boolean wrappedFlag = flag;

        // Unboxing (Boolean to boolean)
        Boolean wrappedFlag2 = false;
        boolean flag2 = wrappedFlag2;

        System.out.println("Autoboxing: " + wrappedFlag); // Output: Autoboxing: true
        System.out.println("Unboxing: " + flag2); // Output: Unboxing: false

	}

}

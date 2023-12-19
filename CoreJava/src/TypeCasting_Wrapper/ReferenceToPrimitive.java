package TypeCasting_Wrapper;

public class ReferenceToPrimitive {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		  // Reference data type: Integer
        Integer numRef = Integer.valueOf(42);

        // Typecasting Integer to int
        int num = numRef.intValue();

        // Display the values
        System.out.println("Reference Integer: " + numRef);
        System.out.println("Primitive int: " + num);

        
        // Reference data type: Double
        Double piRef = Double.valueOf(3.14159);

        // Typecasting Double to double
        double pi = piRef.doubleValue();

        // Display the values
        System.out.println("Reference Double: " + piRef);
        System.out.println("Primitive double: " + pi);
   
        
        
        // Reference data type: Character
        Character initialRef = Character.valueOf('A');

        // Typecasting Character to char
        char initial = initialRef.charValue();

        // Display the values
        System.out.println("Reference Character: " + initialRef);
        System.out.println("Primitive char: " + initial);

        
        
        
	}

}

package TypeCasting_Wrapper;
public class PrimitiveToReferenced {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Primitive data type: double
        double pi = 3.14159;

        // Typecasting double to Double (reference data type)
        Double piRef = Double.valueOf(pi);

        // Display the values
        System.out.println("Primitive double: " + pi);
        System.out.println("Reference Double: " + piRef);
        
        
        
        // Primitive data type: char
        char initial = 'A';

        // Typecasting char to Character (reference data type)
        Character initialRef = Character.valueOf(initial);

        // Display the values
        System.out.println("Primitive char: " + initial);
        System.out.println("Reference Character: " + initialRef);

        
        
        // Primitive data type: boolean
        boolean isSunny = true;

        // Typecasting boolean to Boolean (reference data type)
        Boolean isSunnyRef = Boolean.valueOf(isSunny);

        // Display the values
        System.out.println("Primitive boolean: " + isSunny);
        System.out.println("Reference Boolean: " + isSunnyRef);

        
        
        

	}

}

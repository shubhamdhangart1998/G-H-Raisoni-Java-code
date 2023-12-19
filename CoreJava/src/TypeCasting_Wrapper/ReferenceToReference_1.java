package TypeCasting_Wrapper;
class Animal {
    void makeSound() {
        System.out.println("Animal makes a sound.");
    }
}

class Dog extends Animal {
    @Override
    void makeSound() {
        System.out.println("Dog barks.");
    }
}
public class ReferenceToReference_1 {
	 public static void main(String[] args) {
	        // Reference data type: Animal (referring to a Dog object)
	        Animal animal = new Dog();

	        // Typecasting Animal to Dog
	        Dog dog = (Dog) animal;

	        // Display the values
	        System.out.println("Reference Animal: " + animal);
	        System.out.println("Reference Dog: " + dog);

	        // Call the overridden method
	        dog.makeSound(); // Output: "Dog barks."
	    }
}

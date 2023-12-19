package Down_Casting;
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

    void fetch() {
        System.out.println("Dog fetches the ball.");
    }
}
public class DowncastingExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	    // Upcasting: Dog reference to Animal reference
        Animal animal = new Dog();

        // Downcasting: Animal reference to Dog reference
        if (animal instanceof Dog) {
            Dog dog = (Dog) animal;
            // Now we can call the fetch() method on the Dog reference
            dog.fetch(); // Output: "Dog fetches the ball."
        } else {
            System.out.println("Animal is not of type Dog.");
        }
	}

}

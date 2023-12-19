package Up_Casting;
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
public class UpcastingExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		   // Upcasting: Dog reference to Animal reference
        Animal animal = new Dog();

        // Calling the overridden method from the Dog class
        animal.makeSound(); // Output: "Dog barks."

        // Note: We can't call the fetch() method here because it's not part of the Animal class.

	}

}

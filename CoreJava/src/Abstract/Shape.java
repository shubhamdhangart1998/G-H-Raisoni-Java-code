package Abstract;
//Abstract Class: Shape
//This class is abstract because it contains an abstract method.

public abstract class Shape {
	 private String color;

	    public Shape(String color) {
	        this.color = color;
	    }

	    // Abstract method without implementation.
	    // Concrete subclasses must provide their own implementation.
	    public abstract double calculateArea();

	    public String getColor() {
	        return color;
	    }

	    public void displayInfo() {
	        System.out.println("This is a shape.");
	    }
}

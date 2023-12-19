package Abstract;
//Concrete Subclass: Circle
//This class provides a concrete implementation of the abstract method in Shape.

public class Circle extends Shape {
	 private double radius;

	    public Circle(String color, double radius) {
	        super(color);
	        this.radius = radius;
	    }

	    @Override
	    public double calculateArea() {
	        return Math.PI * radius * radius;
	    }
}

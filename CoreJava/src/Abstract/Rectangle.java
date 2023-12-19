package Abstract;
//Concrete Subclass: Rectangle
//This class provides a concrete implementation of the abstract method in Shape.

public class Rectangle extends Shape {
	   private double length;
	    private double width;

	    public Rectangle(String color, double length, double width) {
	        super(color);
	        this.length = length;
	        this.width = width;
	    }

	    @Override
	    public double calculateArea() {
	        return length * width;
	    }
}

package Abstract;

public class Main {

	public static void main(String[] args)
	{
		// TODO Auto-generated method stub
		
		  Circle circle = new Circle("Blue", 5.0);
	        System.out.println("Circle color: " + circle.getColor());
	        circle.displayInfo();
	        System.out.println("Circle area: " + circle.calculateArea());

	        Rectangle rectangle = new Rectangle("Green", 4.0, 6.0);
	        System.out.println("Rectangle color: " + rectangle.getColor());
	        rectangle.displayInfo();
	        System.out.println("Rectangle area: " + rectangle.calculateArea());
	 
	}

}

package Interface;

interface shape
{
	public void AreaOfCircle();
	
	public void AreaOfRectangle();
	
	public void AreaOfSquare();
}

class Area implements shape
{

	public void AreaOfCircle()
	{
		float pi=3.14f;
		int r=2;
		float circle=pi*r*r;
		System.out.println("Area of circleis:"+circle);
	}

	public void AreaOfRectangle() 
	{
		int lr=10;
		int hr=25;
		int arear=lr*hr;
		System.out.println("Area of rectangle" + arear);
		
		
		
		}

	public void AreaOfSquare() 
	{
		int l=23;
		int arearec=l*l;
		System.out.println("Area of square"+ arearec);

	}
	
}



public class AreaApp 
{
	public static void main(String[] args) 
	{
       Area a1=new Area();
       a1.AreaOfCircle();
       a1.AreaOfRectangle();
       a1.AreaOfSquare();
       

	}

}

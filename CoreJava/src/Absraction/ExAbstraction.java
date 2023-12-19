package Absraction;

abstract class Collage
{
	abstract void set();
	
	void show()
	{
		System.out.println("Collage Application");
	}
}

class EXJSPM extends Collage
{

	void set() 
	{
		System.out.println(" jspm Collage fees is:40000");
	}
	
}
class VIIT extends Collage
{

	void set() 
	{
		System.out.println(" VIIT Collage fees is:25000");
		
	}
	
}
public class ExAbstraction
{
	public static void main(String[] args) 
	{
		
		VIIT v=new VIIT();
		v.show();
		v.set();
		
		EXJSPM e=new EXJSPM();
		e.set();	
	}
}







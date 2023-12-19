package Interface;

//interface Achieve Multiple Inheritance
interface ABC
{
	void set();
}
interface B
{
	void Show();
	
}
class Z implements ABC,B
{

      public void set() 
      {
		System.out.println("set Employee Details");
	    String name="Shruti";
	    int id=101;
	    System.out.println(name+" "+id);
		
	  }
	public void Show() 
	{
		System.out.println("Employee details save successfully");
	}
	
}

public class ExMulti 
{

	public static void main(String[] args)
	{
		Z z1=new Z();
		z1.set();
		z1.Show();

	}

}

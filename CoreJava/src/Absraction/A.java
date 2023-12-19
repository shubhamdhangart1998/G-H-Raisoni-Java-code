/*A method which is declared as abstract and does not have 
 implementation is known as an abstract method.
 Rules:
 we can't create object of abstract class
 * */

package Absraction;

abstract class school
{
	public void set()   //non abstract method
  	{
  		System.out.println("School Application");
  	}
	
  	abstract int getAddmissionFEES();  //Abstract method 	
}
class JSPM extends school
{
	 int getAddmissionFEES() 
	{
		return 25000;
	}
	
}
class Shivaji extends school
{

	int getAddmissionFEES() 
	{
		return 30000;
	}
	
}
class MIT extends school
{
	int getAddmissionFEES() 
	{
		return 45000;
	}
	
}
public class A 
{
	public static void main(String[] args)
	{
		school s;
		s=new JSPM();
		System.out.println("JSPM School fees is:"+s.getAddmissionFEES());

		s=new Shivaji();
		System.out.println("Shivaji School fees is:"+s.getAddmissionFEES());
		
		s=new MIT();
		System.out.println("MIT School fees is:"+s.getAddmissionFEES());
		
	}

}

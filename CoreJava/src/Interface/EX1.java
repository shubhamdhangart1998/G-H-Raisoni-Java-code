/*an interface is a reference type in java
 * it is similar to class.
 * It is a collection of abstract methods
 * 
 * Achieve 100% abstraction.
 * A class implements an interface
 * 
 * here normal methods are by default public +abstract
 * */

package Interface;


interface Sports
{
	public void setHomeTeam(String name);
	public void setVisitingTeam(String name);
	
}
class Hokey implements Sports
{

	public void setHomeTeam(String name) 
	{
		System.out.println(name);
	}

	public void setVisitingTeam(String name) 
	{
		
		System.out.println("visiting team is:"+name);
	}
	
}
class FootBall implements Sports
{

	public void setHomeTeam(String name) 
	{
		System.out.println(name);
	}

	public void setVisitingTeam(String name) 
	{
		System.out.println("visiting team is:"+name);
	}
	
}

public class EX1 
{
	public static void main(String[] args)
	{
		Hokey h=new Hokey();
		h.setHomeTeam("Shivaray"); 
		h.setVisitingTeam("T20");
		
		FootBall b=new FootBall();
		b.setHomeTeam("Team Mumbai"); 
		b.setVisitingTeam("T23");
	

	}

}


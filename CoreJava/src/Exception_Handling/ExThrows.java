package Exception_Handling;

//throws is keyword in exception handling we can use with method.
//1)Normally throws is used for handle the checked exception.
/*2)when we use throws keyword then we not need to 

try and catch block in method*/

/*3)when exception generate in method defination it will 
* throw on method calling*/

/*syntax of throws keyword

returntype method name(arguments)throws exception
{
 //write here logic in method
}
*/

class Div
{
   void setValue(int x,int y) throws Exception
	  {
		int z=x/y;
		System.out.println("Division is"+z);
	  }
	  void show()
	  {
		  System.out.println("I am method");
	  }
	}

public class ExThrows 
{
   public static void main(String[] args) 
	{
    //  Div d=new Div();
	//d.setValue(10,2);
	//d.show();
		try
		{
			Div d=new Div();
		    d.setValue(10,0);
		    
		}
		catch(Exception ex)
		{
			System.out.println("Error is:" +ex);
		}
		
		Div d2=new Div();
		d2.show();
		
	}
}


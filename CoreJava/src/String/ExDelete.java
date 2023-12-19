package String;
public class ExDelete 
{
	public static void main(String args[])
	   {
			StringBuffer sbf = new StringBuffer("javaprogramming");
	        System.out.println("string buffer = " + sbf);
	  
	        // Deleting characters from index 2 to 7
	        sbf.delete(6, 8);
	        System.out.println("After deletion string buffer is = " + sbf);
	    	
	     }
	
}
	


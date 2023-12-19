package Exception_Handling;

//Arrays in programming are used to store a collection of values of the same data type. 
//They provide a way to organize and access multiple elements using a single variable.

public class D {

	public static void main(String[] args) {
		
		
//		int a[]= {10,20,30};
//	System.out.println("value is:"+a[2]);
		try
	   {
		int a[]= {10,20,30};
		
		System.out.println("value is:"+a[20]);
		
	   }
     catch(Exception ex)
		{

    	 System.out.println("First Exception by just refernce name----------------1");
    	 System.out.println("Array limit Exceed" +ex);
	      
    	 
    	 
    	 System.out.println("Second Exception by variable and get msg method---------------2 ");
	    String msg=ex.getMessage();
	      System.out.println("Array limit Exceed" +msg);
	      
	      
	      
	      System.out.println("By using toString-----------------3");
	      System.out.println(ex.toString());
	      
	      
	      
	      System.out.println("By using printStackTrance------------4");
	      ex.printStackTrace();
	
	      
		}
		
		System.out.println("Logic1");
		System.out.println("logic 2");
	}

}



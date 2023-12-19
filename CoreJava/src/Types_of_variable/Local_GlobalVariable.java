package Types_of_variable;

public class Local_GlobalVariable {
	
	
     int a=10;  //global scope throughout the class
	
	public void m1()
	{
		int b=20;     //local variable  
 
		System.out.println(b);
		System.out.println(a+b);
	}
	
	public void m2()
	{
		int c=30;
		System.out.println(c);

		//System.out.println(b);  //error occure

		System.out.println(a+c);
		
	}
		
	 public static void main(String[] args) {
		 
		 
			Local_GlobalVariable E1=new Local_GlobalVariable();
			E1.m2();
			E1.m1();
			
			System.out.println(E1.a);
			

	}

}

	
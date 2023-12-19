package Method;

public class WithParameternonStaticMethod {
	
		 
		 		 
	public void username(String Username)
	
	{
		System.out.println("Your username is="+ Username);
	}
	
	public void password(int pwd)
	{
		System.out.println("Your password is="+ pwd);
	}
	
	public static void main(String[] args) {
		
		WithParameternonStaticMethod shubham=new WithParameternonStaticMethod();
		shubham.username("Krishna");
		shubham.password(785420);
		System.out.println("login successfully");

		  
	
		  
	}

}

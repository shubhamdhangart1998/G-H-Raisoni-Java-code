package controlStatement;

public class Nested_if {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String username="Ashwini";
		String password="Ashwini@123";
		
		if(username=="Ashwini")
		{
			System.out.println("correct username");
			
			if(password=="Ashwini@123")
			{
				System.out.println("correct password");
				System.out.println("login successfully");
			}
			
			else
			{
				System.out.println("wrong password");
				System.out.println("login failed");
			}
		}
			else
			{
				System.out.println("wrong username");
				System.out.println("login failed");
			}

	}

}

package constructor;

public class Userdefined_constructor {


	//in userdefined constructor first declare data type
	//in class then create contructor and initialize value on it
	
	int std_roll;
	String std_name;
	
	Userdefined_constructor()
	{
		//initialization in userdefined constructor
		std_roll=1;
		std_name="ashwini";
	}
	
	public void std_info()
	{
		System.out.println("student information");
		System.out.println("student roll no=" + std_roll);
		System.out.println("student std_name=" + std_name);
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Userdefined_constructor Uc=new Userdefined_constructor();
		Uc.std_info();
		

	}

}

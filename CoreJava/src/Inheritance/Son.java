package Inheritance;

public class Son extends Father {

	
	
	public void mobile()
	{
		System.out.println("mobile");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println("Son properties");

			Son s=new Son();  //son,father,object.toString
			s.car();
			s.home();
			s.mobile();
			System.out.println("Father properties");
			Father f=new Father();   //father,object.toString
			f.car();
			f.home();
//			f.mobile();
			
				

	}

}

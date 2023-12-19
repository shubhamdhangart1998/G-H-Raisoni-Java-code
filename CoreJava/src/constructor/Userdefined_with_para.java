package constructor;

public class Userdefined_with_para {

	int a;  
	int b;
	
	
	Userdefined_with_para()
	{
		//without parameter
		a=10;
		b=20;
	}
	
	
	Userdefined_with_para(int c,int d)  //provide parameter
	{
		//with parameter
		a=c;  //4
		b=d;  //10 
	}
	
	public void add()
	{
		System.out.println(a+b);
	}
	
	public void sub()
	{
		System.out.println(a-b);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		  System.out.println("userdefined constructor without parameter");
		  
		  Userdefined_with_para Up1=new Userdefined_with_para();
		  Up1.add();
		  Up1.sub();
		  
		  
		  System.out.println("userdefined constructor with parameter");
		
		  Userdefined_with_para Up=new Userdefined_with_para(4,10);
			Up.add();
			Up.sub();
		


	}

}

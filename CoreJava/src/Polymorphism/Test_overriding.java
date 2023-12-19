package Polymorphism;

public class Test_overriding {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println("------<<<<<<<<<<***overriding***>>>>>>>>>>------");
		System.out.println();
		

		System.out.println("fathers own property");
		Father F=new Father();
		F.home();
		F.car();
		F.bike();
		
		
		
		System.out.println();
		System.out.println();

		
		System.out.println("fathers inheritance Son  property");
		Father Fa=new Son1();
		Fa.home();
		Fa.car();
		Fa.bike();
		
		
		
		
		System.out.println();
		System.out.println("son1 property ");
		Son1 S1=new Son1();
		S1.mobile();
		S1.home();
		S1.car();
		S1.bike();
		
		

	}

}

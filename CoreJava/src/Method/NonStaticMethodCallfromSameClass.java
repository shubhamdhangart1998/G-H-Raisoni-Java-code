package Method;

public class NonStaticMethodCallfromSameClass {
	
	public  void m1()
	{
		System.out.println("544684684654");
	}
 
	public void m2()
	{
		System.out.println("regular non static method call from same class for m2");
	}
	
	public static void main(String[] args) {
		
		NonStaticMethodCallfromSameClass E4=new NonStaticMethodCallfromSameClass();
		E4.m1();
		E4.m2();
		
	}

}

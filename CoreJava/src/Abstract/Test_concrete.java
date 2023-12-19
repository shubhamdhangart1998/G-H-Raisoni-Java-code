package Abstract;

public class Test_concrete extends Concrete  {
	public void m3()
	{
		System.out.println("abstract concrete  class m3");
	}
	
	void m4()
	{
		System.out.println("abstract concrete class m4");
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Test_concrete c=new Test_concrete();
		System.out.println("complete");
		c.m1();
		c.m2();
		System.out.println("incomplete");
		c.m3();
		c.m4();

	}

}

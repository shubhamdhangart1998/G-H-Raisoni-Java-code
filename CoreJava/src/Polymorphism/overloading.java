package Polymorphism;

public class overloading {
	//same method name but different argument is called method overloading
		public void add(int a,int b)
		{
			System.out.println("addition of two no="+(a+b));
		}
		
		public void add(int a,int b,int c)
		{
			System.out.println("addition of three no="+(a+b+c));
		}

		public void add(String name)
		{
			System.out.println(name);
		}


	public static void main(String[] args) {
		// TODO Auto-generated method stub

		overloading o=new overloading();
		o.add(2, 2);
		o.add(2, 2, 2);
		o.add("Shubham");

		
	}

}

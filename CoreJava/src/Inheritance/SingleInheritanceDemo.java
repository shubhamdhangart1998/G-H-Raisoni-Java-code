package Inheritance;
class A{
	void m1() {
		System.out.println("i am m1");
	}
}
class B extends A{
	void m2() {
		m1();
		System.out.println("i am m2");
	}
}
public class SingleInheritanceDemo {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		B ob=new B();
		A oa=new B();
		oa.m1();
		oa.toString();
		//oa.m2();
		ob.m1();
		ob.m2();
                ob.toString();
		Object o=new B();
		//o.m1();
		//o.m2();
		o.toString();
		
		
		
		Object s=ob.toString();
		System.out.println(s);
		//case2
		A ao=new A();
		Object obj=new A();
		//B ob=new A();//we can't create child class reference and parent class object
		ao.m1();
		//ao.m2();
		ao.toString();
		//obj.m1();
		System.out.println(obj.toString());

	}

}

package Nested;
class A{
	void f1() {
		System.out.println("I am f1 of A");
	}
	void f2() {
		System.out.println("I am f2 of A");
	}
	static void f3() {
		System.out.println("I am f3 of A");
	}
    static class B{
		void m1() {
			System.out.println("I am m1 of B");
		}
		static void m2() {
			System.out.println("I am m2 of B");
			
		}
		class C{
			void a1() {
				System.out.println("I am a1 of C");
			}
		}
		
	}
	
}

public class InnerClassDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		A.B ob=new A.B();
		ob.m1();
		ob.m2();
		A oa=new A();
		oa.f1();
		A.f3();
		oa.f2();
		//oa.m1();
	}

}

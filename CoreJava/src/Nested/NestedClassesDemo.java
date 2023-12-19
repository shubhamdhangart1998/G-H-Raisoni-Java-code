package Nested;
class Emp{
	int eid;
	String ename;
	float eSal;
	class Address{
		String doorNo;
		String Street;
		String city;
		int pinCode;
		
	}
}
public class NestedClassesDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Emp emp=new Emp();
		emp.eid=101;
		emp.ename="Sonam";
		emp.eSal=120.89f;
		Emp.Address a=emp.new Address();
		a.doorNo="201";
		a.Street="xyz";
		a.city="Pune";
		a.pinCode=411001;
		
		Emp.Address a1=emp.new Address();
		a1.doorNo="202";
		a1.Street="abnvc";
		a1.city="mumbai";
		a1.pinCode=474001;

		
		System.out.println(emp.eid+" "+emp.ename+" "+emp.eSal);
		System.out.println(a.city+" "+a.pinCode+" "+a.Street+" "+a.doorNo);
		System.out.println(a1.city+" "+a1.pinCode+" "+a1.Street+" "+a1.doorNo);

	}

}

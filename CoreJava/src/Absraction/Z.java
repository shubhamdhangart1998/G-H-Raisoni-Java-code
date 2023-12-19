package Absraction;

abstract class Data
{
	abstract void show();
	
	void display()
	{
		System.out.println("simple method");
	}
}

class Student extends Data
{
	void show() 
	{
		String name="Sanket";
		int rollno=12;
		System.out.println("student details");
		System.out.println("My name is:"+name);
		System.out.println("RollNo is:"+rollno);
		
	}
	
}

public class Z {

	public static void main(String[] args)
	{
		Student st=new Student();
		
        st.show();
        st.display();
	}

}

package Interface;

interface Circle{
	double r=5;
	void area();
}
class A implements Circle{
	public void area() {
		double a=3.14*r*r;
		System.out.println("Area of circle is:"+a);
	}
	void show() {
		System.out.println("We are implementing interface");
	}
}
public class AreaOfCircle {
	public static void main(String[] args) {
		A oa=new A();
		oa.area();
		oa.show();
	}

}

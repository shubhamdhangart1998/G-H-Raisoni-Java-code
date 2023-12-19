package Method;

public class CallingofNonStaticMethod {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		shubham s=new shubham();
	
		
		s.m1();
		s.m2();
		//s.shubham();
		//s.dhangar();
	
  Demo d=new Demo();
  d.m1();
  
  
  test t=new test();
  
  t.shubham(1001, "Chaitali", 87.52f);
  
  
  t.dhangar();
  
  
  test.dhangar();
  
	}

}

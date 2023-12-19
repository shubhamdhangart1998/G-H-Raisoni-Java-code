package Exception_Handling1;

import java.lang.reflect.Method;

class Demo{
	public void getClass(String clName) {
		try {
			Class cl=Class.forName(clName);
			System.out.println("Class name:"+cl.getName());
			Method[] l=cl.getMethods();
			for(Method m:l)
				System.out.println(m);
		}
		catch(Exception e) { //to handle common exception 
			e.printStackTrace();
		}
		finally {
			System.out.println("Bye friends........");	
			}
	}
}
public class CheckedException {
	public static void main(String[] args) {
		Demo d=new Demo();
		d.getClass("com.pp.A");
		
	}

}

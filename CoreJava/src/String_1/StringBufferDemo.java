package String_1;
public class StringBufferDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		StringBuffer s1=new StringBuffer("Java");
		System.out.println(s1);
		//s1.reverse();
		//System.out.println(s1);
		s1.append(" programming");
		System.out.println(s1);
		s1.insert(0, "New ");
		System.out.println(s1);
		s1.insert(8, " Love ");
		System.out.println(s1);
		

	}

}

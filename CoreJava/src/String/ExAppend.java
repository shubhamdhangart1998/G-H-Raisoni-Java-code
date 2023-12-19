package String;
public class ExAppend
{
		public static void main(String[] args)
		{
			StringBuffer s=new StringBuffer("helloshivam");//size 11
			s.append("Triloki");
			
			System.out.println(s);
			
			System.out.println(s.length());//length()
			
			System.out.println(s.capacity());
			//capacity of string is 16 //16+11
		}
		

	}



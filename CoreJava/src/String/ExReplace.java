package String;
public class ExReplace 
{
		public static void main(String[] args) 
		{
			
			StringBuffer s=new StringBuffer("nikitaAbc");
			
			s.replace(5,6,"java");//index,size

			//nijavata
	         System.out.println(s);
		}

}

//0 1 2 3 4 5    //3 =0 1 2 replace because 
//n i k i t a    //1 =start from 1 index print word eg java
//n j a v a  i t a


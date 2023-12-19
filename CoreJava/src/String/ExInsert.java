package String;
//A string buffer is like a String , but can be modified.
public class ExInsert 
{
	public static void main(String[] args) 
		{
			StringBuffer st=new StringBuffer("Harshda");
			st.insert(5,"xyz");    //
			System.out.println(st);
			
			//Harshxyzda
	    	st.insert(2,"shiv");
			System.out.println(st);
	     }
	}


package TypeCasting_Wrapper;

/*wrapper classes is used for perform the conversion between or primitive data type or Objects.

* type casting between primitive data type to object 
 * object to primitive data type.*/


public class ExWrap {

		public static void main(String[] args) {
			
			 int b=100;  
			 Integer a;//Integer is class and a is reference here.
	         
	         //int is a data type so it is primitive data type.
			 
			 a=b;     //autoboxing
			 
			 System.out.println("a is"+a);
			
			Integer d=600;
			 int c;
			 
			 
			 c=d;  //autounboxing
			 System.out.println("c is "+c);  
			 
			
			 
	      
		}

	}





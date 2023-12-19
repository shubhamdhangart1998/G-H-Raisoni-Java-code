package String;
public class ExMethods 
{
	//methods in string
	public static void main(String[] args) 
	{
		
			String a="AKSHAY";
			//String b="Akshay"; //use for equals
			String b="deshmukh";
			String c="shiva";
			
			
			System.out.println(a.toLowerCase());//toLowerCase()
			
			System.out.println(b.toUpperCase());//toUpperCase()
			
			System.out.println(a.concat("demo"));    //concat() //join to strings
			System.out.println((a.concat(b)).concat(c));
			
			System.out.println(b.length());  //length()
			
	    	String z="   Ankush   "; 
	        System.out.println(z);
	        System.out.println(z.trim());   //c.trim don't show space//trim()
		  
	    	String d="xyz";//if we print name display output false
	      System.out.println(d.isEmpty()); //print true //isEmpty()
		
	     System.out.println(b.charAt(7)); //charAt()
		
	      System.out.println(b.indexOf('h'));//indexOf()
		
	     System.out.println(b.equals(a));//if name is same print true
	       
		 System.out.println(b.replace('m','i'));
	    System.out.println(b.replace("mu","iy"));
	    
	   }
	}



/*
String is an object that 

 * represents sequence of char values.
 *  An array of characters works same as Java string.
 * 
 * char[] ch={'B','O','R','G','W','A','R','D'};  
    String s=new String(ch);  
    
    same like as 
    String s="Borgword";
    
    CharSequence Interface:
    The CharSequence interface is used to
    represent the sequence of characters. 
     1)String, 2)StringBuffer and 3)StringBuilder
     
     The Java String is immutable which means it cannot be changed. 
     Whenever we change any string, a new instance is created. 
     For mutable strings, 
     you can use StringBuffer and StringBuilder classes.
     
     What is String in Java?
     
  String is a sequence of characters. 
string is an object that represents a sequence of characters. 
The java.lang.String class is used to create a string object.

How to create a string object?
There are two ways to create String object:

By string literal  ex:String s="Borgword";  
By new keyword :String s=new String("kajol");/
 * */

package String;
//String is collection of characters/sequence of characters
//String is immutable in java.//we can't change
public class ExString1 
{

	public static void main(String[] args) 
	{
		String a="Aniket";
		a.concat("Sawant");//concat()   concatination join two strings
		System.out.println(a);
		//System.out.println(a.concat("demo"));
   }

}

//concatination-->a.concat("shriraj")



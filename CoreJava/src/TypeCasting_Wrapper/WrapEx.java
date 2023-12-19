//Wrapper Classes

//convert primitive data types  to objects is called as autoboxing

//convert object to primitive data types called as Autounboxing
package TypeCasting_Wrapper;


public class WrapEx
{
	public static void main(String args[])
	{  
		byte b=10;  
		short s=20;  
		int i=30;  
		long l=40;  
		float f=50.0F;  
		double d=60.0D;  
		char c='a';  
		boolean b2=true;  

		//Autoboxing: Converting primitives into objects  
		Byte byteobj=b;  
		Short shortobj=s;  
		Integer intobj=i;  
		Long longobj=l;  
		Float floatobj=f;  
		Double doubleobj=d;  
		Character charobj=c;  
		Boolean boolobj=b2;  

		//Printing objects  
		System.out.println("---Printing object values---");  
		System.out.println("Byte object: "+byteobj);  
		System.out.println("Short object: "+shortobj);  
		System.out.println("Integer object: "+intobj);  
		System.out.println("Long object: "+longobj);  
		System.out.println("Float object: "+floatobj);  
		System.out.println("Double object: "+doubleobj);  
		System.out.println("Character object: "+charobj);  
		System.out.println("Boolean object: "+boolobj);  

		//AutoUnboxing: Converting Objects to Primitives  

		Byte b1=15;  
		Short sh=8;  
		Integer in=3000;  
		Long lo=1000l;  
		Float fl=100.200f;  
		Double db=2345.654;  
		Character ch='r';  
		Boolean bl1=false;  


		byte bytevalue=b1;  
		short shortvalue=sh;  
		int intvalue=in;  
		long longvalue=lo;  
		float floatvalue=fl;  
		double doublevalue=db;  
		char charvalue=ch;  
		boolean boolvalue=bl1;  

		//Printing primitives  
		System.out.println("---Printing primitive values---");  
		System.out.println("byte value: "+bytevalue);  
		System.out.println("short value: "+shortvalue);  
		System.out.println("int value: "+intvalue);  
		System.out.println("long value: "+longvalue);  
		System.out.println("float value: "+floatvalue);  
		System.out.println("double value: "+doublevalue);  
		System.out.println("char value: "+charvalue);  
		System.out.println("boolean value: "+boolvalue);  
	}
}



package Nested;
class StaticBlock {
	static int var;
	static void cfg(){
		//static int var1;
	}
	
	static {
		System.out.println("Hii friends");
	}
	
	public static void main(String[]args) {
		
	}

}
/* I want to print "Hello" even before main() is executed. How will you achieve that?
Print the statement inside a static block of code. Static blocks get executed when the 
class gets loaded into the memory and even before the creation of an object. Hence it 
will be executed before the main() method. And it will be executed only once.*/

/* Can we declare a static variable inside a method?
Static variables are class level variables and they can't be declared inside a method. 
If declared, the class will not compile. */
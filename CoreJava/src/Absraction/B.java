/*Abstraction is hinding the implementention details form end user


and showing only functionality to the user*/
//Abstraction Acheive 0-100%
//abstract is keyword we can use in abstraction
//in abstraction class is abstract
//The abstract keyword is a non access modifier used for classes and methods.
//syntax:
//abstract void methodname();
//abstract method dont have logic.
//we cant call to abstract method.
//Override is must
package Absraction;
abstract class Employee
{
	abstract void Skillset();
	void show()
	{
		System.out.println("This is simple method");
	}
}
class Developer extends Employee
{
  void Skillset() 
	{
		System.out.println("I am good in Coding");
	}
	
}
class Tester extends Employee
{
    void Skillset()
	{
		System.out.println("I am good in testing");
	}
}
public class B {

	abstract class Employee
	{
		abstract void Skillset();
		void show()
		{
			System.out.println("This is simple method");
		}
	}
	class Developer extends Employee
	{
	  void Skillset() 
		{
			System.out.println("I am good in Coding");
		}
		
	}
	class Tester extends Employee
	{
	    void Skillset()
		{
			System.out.println("I am good in testing");
		}
	}
}

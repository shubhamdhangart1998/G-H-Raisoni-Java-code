package demo;

class MyThreadRunnable1 implements Runnable
{
	
	public void run() 
	{
		System.out.println("I am thread 1");
		System.out.println("Hello");
	}
}
class MyThreadRunnable2 implements Runnable
{
	public void run() 
	{
		System.out.println("I am thread 2");
		System.out.println("java developer");
	}
}
public class BYRunnable {

	public static void main(String[] args) 
	{
		MyThreadRunnable1  s1=new MyThreadRunnable1();
		//s1.start();
		
	   Thread g=new Thread(s1);
	   g.start();
	   
	   for(int i=1;i<=5;i++)
	   {
		   System.out.println("I am thread"+i);
		   try
		   {
			 Thread.sleep(900);  
		   }
		   catch(Exception ex)
		   {
			   System.out.println(ex);
		   }
	   }
	   
	   MyThreadRunnable2 s2=new MyThreadRunnable2();
	   Thread g1=new Thread(s2);
	   g1.start();
	   
	   
	}

}


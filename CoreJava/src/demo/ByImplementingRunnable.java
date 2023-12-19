package demo;
class Q implements Runnable
{
	public void run()  //run method inbuilt
	{
		for(int i=1;i<=5;i++)
		{
			System.out.println("My child thread");
			try
			{
			Thread.sleep(500);	
			}
			catch(Exception e)
			{
			}
			}
		}
		
	}
class D implements Runnable
{
	public void run()  //run method inbuilt
	{
		for(int i=1;i<=5;i++)
		{
			System.out.println("My child1 thread");
		}
		
	}
}
public class ByImplementingRunnable
{
  public static void main(String[] args)
	{
	  for(int i=1;i<=5;i++)
		{
		 System.out.println("My main thread");
		}
	  
		Q v=new Q();
		Thread t=new Thread(v);
		t.start();
		
		D d1=new D();	
		Thread f=new Thread(d1);
		f.start();
	}

}


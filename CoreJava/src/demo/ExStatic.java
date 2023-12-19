package demo;
//synchronized declare within method

class EX
{
	synchronized static void show()
	{
		Thread s3=Thread.currentThread();
		
		
		for(int i=0;i<=5;i++)
		{
			try
			{
				Thread.sleep(500);
				System.out.println(s3.getName()+" "+i);
			}
			catch(Exception e)
			{
			
			}
			}
		}
	}
class W extends Thread
{
	
	public void run()
	{
		EX.show();
	}
	
}

public class ExStatic
{
	public static void main(String[] args) 
	{
			
		W w1=new W();
		w1.start();
		
//		W w2=new W();
//		w2.start();
//		
//		W w3=new W();
//		w3.start();	
	}

}


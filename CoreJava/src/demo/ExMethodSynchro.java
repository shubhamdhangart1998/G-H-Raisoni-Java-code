//methods of thread class
//thread is 
//start()
//run()  //called by start method
//sleep(miliseconds)-> used in try and catch block
//Thread.sleep();
//join()->wait the thread to complete its process
//getId()->it gives id of thread
//getName()->It gives thread name always start from thread-0
//setName(String)->Thread name will be replaced with given String
//getPriority()->Priority range from 1 to 10
//min-Priority-1
//NORM-priority-5----->default
//Max-priority-10
//setPriority(integer)->setPriority(10)
//            (1-10)
//isAlive()-->true-if thread is still running
//            false-if thread complete it execution
//

package demo;

class Th extends Thread
{
	Thread t=currentThread();
	
	public void run()
	{
		for(int i=0;i<=5;i++)
		{
			try
			{
				Thread.sleep(1000);
			}
			catch(Exception ex)
			{
				System.out.println(i);
			}
			
			System.out.println(i);
		}
	}
}
public class ExMethodSynchro 
{
	public static void main(String[] args) 
	{
		Th t1=new Th();
		System.out.println("ID="+t1.getId());
		System.out.println("Name of Thread is"+t1.getName());
		t1.setName("Shubham");
		System.out.println(t1.getName());
		
		System.out.println("Priority of Thread is:"+t1.getPriority());
		
		t1.setPriority(1);
		System.out.println(t1.getPriority());
		t1.start();
	}

}














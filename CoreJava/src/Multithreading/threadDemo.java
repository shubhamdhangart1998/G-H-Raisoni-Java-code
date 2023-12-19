package Multithreading;

class MyThread implements Runnable{

	@Override
	public void run() {
		// TODO Auto-generated method stub
		Thread t=Thread.currentThread();
		System.out.println(t.getName()+" "+t.getPriority());
		try {
			Thread.sleep(2000);
		}
		catch(Exception e) {
			e.printStackTrace();
		}
	}
	
}
public class threadDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MyThread m=new MyThread();
		Thread t= new Thread(m);
		t.setName("Sonam");
		t.setPriority(Thread.MAX_PRIORITY);
		t.start();
		Thread t1= new Thread(m);
		t1.setName("Atul");
		t1.setPriority(Thread.NORM_PRIORITY);
		t1.start();
		Thread t2= new Thread(m);
		t2.setName("Snehal");
		t2.setPriority(Thread.MIN_PRIORITY);
		t2.start();
	}

}

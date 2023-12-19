package Multithreading;

class Test implements Runnable{
int a,b;
	public Test(int a, int b) {
	super();
	this.a = a;
	this.b = b;
}
	@Override
	public void run() {
		// TODO Auto-generated method stub
		try {
			Thread.sleep(3000);
			System.out.println("sum="+(a+b));
		}
		catch(Exception e){
			e.printStackTrace();
		}
	}
	
}
public class MulthreadingDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Test test=new Test(20,10);
		for(int i=1;i<500;i++) {
			Thread t=new Thread(test);
			t.start();
		}
	}

}

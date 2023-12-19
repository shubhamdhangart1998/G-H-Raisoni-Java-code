package Multithreading;

class A
{
	
	public void add(int a,int b) throws InterruptedException {
		Thread.sleep(2000);
		System.out.println("sum="+(a+b));
	}
}
public class SingleThreadDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		A oa=new A();
		for(int i=1;i<=20;i++) {
			try {
				oa.add(10, 20);
				
			}
			catch(Exception e) {
				System.out.println(e);
				e.printStackTrace();
			}
		}

	}

}

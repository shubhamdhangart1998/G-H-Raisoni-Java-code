package Multithreading;

public class Train implements Runnable {
	private int avlSheet;
	private int waitSheet;
	
	public Train(int avlSheet, int waitSheet) {
		super();
		this.avlSheet = avlSheet;
		this.waitSheet = waitSheet;
	}
	@Override
	synchronized public void run() {
		// TODO Auto-generated method stub
		Thread t=Thread.currentThread();
			System.out.println("Avaliable sheet is:"+avlSheet);
			System.out.println("Waiting Sheet is:"+waitSheet);
			if(avlSheet>=waitSheet) {
				System.out.println(waitSheet+" are resived for "+t.getName());
				try {
					Thread.sleep(2000);
					avlSheet=avlSheet-waitSheet;
				}
				catch(Exception e) {
					e.printStackTrace();
				}
			}
			else {
				System.out.println("Sorry Sheet are not avilable......"+t.getName());
			}
		}

}

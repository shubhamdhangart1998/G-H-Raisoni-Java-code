
package Interface;
public class Car implements Vehicle {
	public void start() {
		System.out.println("Starting engine......");
	}
	public void stop() {
		System.out.println("Stopping engine......");
	}
	public static void main(String[] args) {
		Car c=new Car();
		c.start();
		c.stop();
	}
}

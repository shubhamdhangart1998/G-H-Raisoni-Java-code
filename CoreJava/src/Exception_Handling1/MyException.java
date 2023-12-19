package Exception_Handling1;
class CustomException1 extends RuntimeException{
	 public CustomException1() {
		 super();
	 }
	 public CustomException1(Throwable cause) {
		 super(cause);
	 }
 }

public class MyException extends Exception{
	String msg;
	MyException(String msg){
		this.msg=msg;
	}
	@Override
	public String toString() {
		return "MyException(msg="+msg+"]";
	}

}

package Exception_Handling1;

public class PositiveNumberException extends RuntimeException{
	String msg;
	
	public PositiveNumberException(String msg) {
		super();
		this.msg=msg;
	}
	public String toString() {
		return "PositiveNumberException [msg="+msg+"]";
	}
	public String getMessage() {
		return msg;
	}

}

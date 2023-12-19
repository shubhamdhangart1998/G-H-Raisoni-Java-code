package Exception_Handling;


class CustomException extends Exception {
    public CustomException(String message) {
        super(message);
    }
}

public class ThrowExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		  try {
	            int age = 105;
	            if (age < 18) {
	                throw new CustomException("You are too young to enter.");
	            } else {
	                System.out.println("Welcome! You are eligible to enter.");
	            }
	        } catch (CustomException e) {
	            System.err.println("CustomException caught: " + e.getMessage());
	        }
	}

}

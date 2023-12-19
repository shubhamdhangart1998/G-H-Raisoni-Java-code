package Exception_Handling1;
class A{
	public int divideNumber(int a,int b) {
		try {
			System.out.println("Before operation statement executed");
			int result=a/b;
			System.out.println("After operation statement executed");
		     return result;
	       }
		
	    catch(ArithmeticException e){
	    	String msg=e.getMessage();
	    	System.err.println("Inside catch "+msg);
	         return 0;
	       }
      }
}

public class TrycatchRuleDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try{
			A oa=new A();
//		    int a= 0;                   //Integer.parseInt(args[0]);
//		    int b= 10;                 //Integer.parseInt(args[1]);

			
		    // 1. Division by zero (ArithmeticException)
//             int a = 10;
//             int b = 0;
            
            // 2. Array index out of bounds (ArrayIndexOutOfBoundsException)
//             int[] arr = new int[5];
//             int a = arr[10];
//            
            // 3. Invalid number format (NumberFormatException)
             int a = Integer.parseInt("abc");
//        
////			
//			int result=a/0;
//		    System.out.println(result);
		}
		catch (ArithmeticException e) {
            System.err.println("ArithmeticException caught: " + e.getMessage());
        } catch (ArrayIndexOutOfBoundsException e) {
            System.err.println("ArrayIndexOutOfBoundsException caught");
            e.printStackTrace();
        } catch (NumberFormatException e) {
            System.err.println("NumberFormatException caught: " + e.toString());
        } catch (Exception e) {
            System.err.println("Exception caught: " + e.toString());
        }
		
    }

}

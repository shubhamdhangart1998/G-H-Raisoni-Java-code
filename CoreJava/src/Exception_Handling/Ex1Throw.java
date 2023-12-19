
/*
throw keyword which is specially designed for 
 handle the user defined exception*/

/*what is user defined exception?
 *means those exception defined by user for 
 * its own use called as user defined exception */

/*why we need to use user defined exception?
 * If programmer want to create the customize error message 
 * and exception according to his project
 * then he can write the user defined exception */

/*2)If programmer having logical error at run time 
 * and java API not provide 
 * the appropriate classes to handle the logical error 
 * then user can create own exception class and handle the error
 * then he need to create user defined exception
 *  */

package Exception_Handling;


public class Ex1Throw {   
    //function to check if person is eligible to vote or not   
     public static void validate(int age) 
    {  
        if(age>18) 
        {  
            //throw Arithmetic exception if not eligible to vote  
        	//System.out.println("Eligible for vote");
      throw new ArithmeticException("Person is eligible to vote");    
        }  
        else 
        {  
            System.out.println("Person is not eligible to vote!!");  
        }  
    }  
    //main method  
    public static void main(String args[]){  
        //calling the function 
    	//validate(22);
        try
        {validate(19);  
        }
        catch(Exception ex)
        {
        	System.out.println(ex);
        }
        System.out.println("remaining  code..."); 
        System.out.println("logic1");
        System.out.println("logic2");
  }    
}    


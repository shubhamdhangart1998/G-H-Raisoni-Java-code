package Logic;

public class ArmstrongNo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		   int num = 153; // Replace this number with the one you want to check

//	        int result = 0;
//	        int originalNum = num;
//
//	        while (num > 0) {
//	            int digit = num % 10;
//	            result += (digit * digit * digit);
//	            num /= 10;
//	        }
//
//	        if (originalNum == result) {
//	            System.out.println("Is Armstrong Number");
//	        } else {
//	            System.out.println("Is not Armstrong Number");	    }
	
	
		   int n=153;
		   int temp = n;
		   
		   int r,sum=0;
		   
		   while(n>0)
		   {
		   r= n%10;
		   n = n/10;
		   sum = sum + r*r*r;
		   }
		   if (temp == sum)
			   System.out.println("it is ");
		   else
			   System.out.println("not");
	
	
	
	
	
	}

}

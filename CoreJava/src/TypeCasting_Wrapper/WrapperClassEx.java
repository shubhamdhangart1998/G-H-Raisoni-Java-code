package TypeCasting_Wrapper;

public class WrapperClassEx {
	
	public static void main(String[] args) {
		
		// TODO Auto-generated method stub
		
		System.out.println("Before type casting");
		System.out.println(args[0]+args[1]);
		System.out.println("After type casting");
		int a=Integer.parseInt(args[0]);
		float b=Float.parseFloat(args[1]);
		System.out.println(a+b);

	}

}

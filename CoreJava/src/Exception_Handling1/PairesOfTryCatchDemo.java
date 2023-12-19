package Exception_Handling1;
import java.util.Scanner;
class Test{
	public void m1(int index) {
		int arr[]= {10,20,30,40,50,60};
		String city="Maharashtra";
		try {
			System.out.println(arr[index]);
		}
		catch(ArrayIndexOutOfBoundsException e){
			e.printStackTrace();
		}
		try {
			System.out.println(city.charAt(index));

		}
		catch(StringIndexOutOfBoundsException e){
			e.printStackTrace();
		}
	}
}
public class PairesOfTryCatchDemo {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter index:");
		int index=sc.nextInt();
		Test t=new Test();
		t.m1(index);
		System.out.println(index);
		
	}

}

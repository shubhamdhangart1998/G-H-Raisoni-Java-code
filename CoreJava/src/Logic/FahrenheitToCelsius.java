package Logic;

import java.util.Scanner;

public class FahrenheitToCelsius {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		float temperatue;
		Scanner in = new Scanner(System.in);
		System.out.println("Enter temperatue in Fahrenheit");
		temperatue = in.nextInt();
		
		
		temperatue = ((temperatue - 32)*5)/9;
		System.out.println("Temperatue in Celsius = " + temperatue);

	}

}

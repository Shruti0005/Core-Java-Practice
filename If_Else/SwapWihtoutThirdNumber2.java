package If_Else;

import java.util.Scanner;

public class SwapWihtoutThirdNumber2 {
	public static void main(String[] args) {
		//WAP TO SWAP TWO VARIABLE WITHOUT USING THIRD VARIABLE?
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the first value: ");
		int num1 = sc.nextInt();
		System.out.print("\nEnter the Second value: ");
		int num2 = sc.nextInt();
		
		if(num1 != num2) {
			num1 = num1 ^ num2;
			num2 = num1 ^ num2;
			num1 = num1 ^ num2;
			System.out.println("First value: " + num1 + "\nSecond value: " + num2);
		}
		else {
			System.out.println("Sorry! we can't swap because both value are same.");
		}
		
		sc.close();
	}
}

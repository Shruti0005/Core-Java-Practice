package If_Else;

import java.util.Scanner;

public class CheckWetherNumDivisibleBy5Or3 {
	public static void main(String[] args) {
		//WAP to check whether a number is: Divisible by 3 only, Divisible by 5 only, Divisible by both 3 and 5, Not divisible by both
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the value: ");
		int num = sc.nextInt();

		if (num % 3 == 0 && num % 5 == 0) {
			System.out.println(num + " is divisible by 3 and 5.");
		} else if (num % 3 == 0) {
			System.out.println(num + " is divisible by 3 only.");
		} else if (num % 5 == 0) {
			System.out.println(num + " is divisible by 5 only.");
		} else {
			System.out.println(num + " is not divisible by 3 or 5.");
		}
		sc.close();
	}
}

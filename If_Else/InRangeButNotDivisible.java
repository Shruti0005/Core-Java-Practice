package If_Else;

import java.util.Scanner;

public class InRangeButNotDivisible {
	public static void main(String[] args) {
		// WAP to check whether a number is in range but NOT divisible by a specific
		// number
		Scanner sc = new Scanner(System.in);
		System.out.print("Enterh the value: ");
		int num = sc.nextInt();

		System.out.print("\nEnter the lower range number: ");
		int lowerRange = sc.nextInt();
		System.out.print("\nEnter the higher range number: ");
		int higherRange = sc.nextInt();

		System.out.print("\nEnter the divisior: ");
		int divisior = sc.nextInt();

		if ((num >= lowerRange && num <= higherRange) && num % divisior != 0) {
			System.out.println("Valid number.");
		} else {
			System.out.println("Invalid number.");
		}

		sc.close();
	}

}

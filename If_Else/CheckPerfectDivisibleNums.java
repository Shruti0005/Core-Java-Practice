package If_Else;

import java.util.Scanner;

public class CheckPerfectDivisibleNums {
	public static void main(String[] args) {
		//WAP to check whether a number is perfectly divisible by another number (take both inputs)
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the first value: ");
		int a = sc.nextInt();
		System.out.print("Enter the second value: ");
		int b = sc.nextInt();
		
		if (b == 0) {
			System.out.println("Sorry! " + a + " can't be divisible by 0");
		}
		else if (a % b == 0) {
			System.out.println(a + " is perfectly divisible by " + b);
		}
		else {
			System.out.println(a + " isn't perfectly divisible by " + b);
		}
		
		sc.close();
	}

}

package If_Else;

import java.util.Scanner;

public class DivisibleByBoth3and5 {
	public static void main(String[] args) {
		//WAP to check whether a number is divisible by both 3 and 5
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the value: ");
		int num = sc.nextInt();
		
		if (num % 3 == 0 && num % 5 == 0) {
			System.out.println(num + " is divisible by both 3 and 5.");
		}
		else {
			System.out.println(num + " isn't divisible by both 3 and 5.");
		}
		sc.close();
	}

}

package If_Else;

import java.util.Scanner;

public class CheckNumBetween10Or50 {
	public static void main(String[] args) {
		//WAP to check whether a number is between 10 and 50 (inclusive)
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the value: ");
		int num = sc.nextInt();
		
		if (num < 10) {
			System.out.println(num + " is less than 10.");
		}
		else if (num >= 10 && num <= 50) {
			System.out.println(num + " is between 10 and 50.");
		}
		else {
			System.out.println(num + " is greater than 50.");
		}
		
		sc.close();
	}

}

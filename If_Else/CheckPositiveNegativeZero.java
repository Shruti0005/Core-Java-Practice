package If_Else;

import java.util.Scanner;

public class CheckPositiveNegativeZero {
	public static void main(String[] args) {
		//WAP to check whether a number is positive, negative, or zero
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the value: ");
		int num = sc.nextInt();
	
		if(num > 0) {
			System.out.println(num + " is a Positive Number.");
		}
		else if (num < 0) {
			System.out.println(num + " is a Negative Number.");
		}
		else {
			System.out.println(num + " is a Zero.");
		}
		
		sc.close();
	}

}

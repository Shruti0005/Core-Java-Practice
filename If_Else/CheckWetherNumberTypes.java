package If_Else;

import java.util.Scanner;

public class CheckWetherNumberTypes {
	public static void main(String[] args) {
		//WAP to check whether a number is: Positive AND even, Positive AND odd, Negative AND even, Negative AND odd, Zero
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the value: ");
		int num = sc.nextInt();
		
		if(num == 0) {
			System.out.println("The number is Zero.");
		}
		else if(num > 0) {
			if(num % 2 == 0) {
				System.out.println(num + " is Positive Even number.");
			}
			else {
				System.out.println(num + " is Positive Odd Number.");
			}
		}
		else {
			if(num % 2 == 0) {
				System.out.println(num + " is Negative Even number.");
			}
			else {
				System.out.println(num + " is Negative Odd Number.");
			}
		}
		sc.close();
	}

}

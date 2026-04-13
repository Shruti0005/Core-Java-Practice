package If_Else;

import java.util.Scanner;

public class CheckLeapYear {
	public static void main(String[] args) {
		//WAP to check whether a year is a leap year or not
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the year in this form(xxxx): ");
		int num = sc.nextInt();
		
		if ((num % 4 == 0 && num % 100 != 0) || (num % 400 == 0)) {
			System.out.println(num + " is a leap year.");
		}
		else { 
			System.out.println(num + " is not a leap year.");
		}
		sc.close();
	}

}


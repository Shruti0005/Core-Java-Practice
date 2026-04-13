package If_Else;

import java.util.Scanner;

public class CountingOfDigits {
	public static void main(String[] args) {
		//WAP to check whether a number is a 2-digit, 3-digit, or more
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the value: ");
		int num = sc.nextInt();
		num = Math.abs(num);
		int temp = num;
		
		int count = 0;
		if (num == 0) {
			count = 1;
		}
		while(num > 0) {
			count++;
			num /= 10;
		}
		
		if(count < 2) {
			System.out.println(temp + " is a less than 2-digit");
		}
		else if (count == 2) {
			System.out.println(temp + " is a 2-digit.");
		}
		else if(count == 3) {
			System.out.println(temp + " is a 3-digit.");
		}
		else {
			System.out.println(temp + " is a more than 3-digits.");
		}
		
		sc.close();
	}

}

package If_Else;

import java.util.Scanner;

public class FindAbsoluteValue {
	public static void main(String[] args) {
		//WAP to find absolute value of a number (without using Math.abs())
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the value: ");
		int num = sc.nextInt();
		
		int result = 0;
		if (num < 0) {
			result = -num;
		}
		else {
			result = num;
		}
		System.out.println("Absulte value is " + result);
		sc.close();
	}

}

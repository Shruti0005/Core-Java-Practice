package If_Else;

import java.util.Scanner;

public class MultipleOf7ButNot5 {
	public static void main(String[] args) {
		//WAP to check whether a number is multiple of 7 but not 5
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the value: ");
		int num = sc.nextInt();
		
		if(num % 7 == 0 && num % 5 != 0) {
			System.out.println(num + " is multiple of 7 but not 5.");
		}
		else { 
			System.out.println(num + " isn't multiple of 7 but not 5");
		}
		sc.close();
	}

}

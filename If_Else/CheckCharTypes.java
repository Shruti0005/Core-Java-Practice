package If_Else;

import java.util.Scanner;

public class CheckCharTypes {
	public static void main(String[] args) {
		//WAP to check whether a character is uppercase, lowercase, digit, or special character
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the charcter: ");
		char ch = sc.next().charAt(0);
		
		if (ch >= 'A' && ch <= 'Z') {
			System.out.println(ch + " is Uppercase character.");
		}
		else if (ch >= 'a' && ch <= 'z') {
			System.out.println(ch + " is Lowercase character.");
		}
		else if (ch >= '0' && ch <= '9') {
			System.out.println(ch + " is Digit character.");
		}
		else {
			System.out.println(ch + " is Special character.");
		}
		
		sc.close();
	}

}

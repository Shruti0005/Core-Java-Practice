package If_Else;

import java.util.Scanner;

public class CheckHexadecimalChar {
	public static void main(String[] args) {
		//WAP to check whether a character is hexadecimal digit (0–9, A–F)
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter the character: ");
		char ch = sc.next().charAt(0);
		
		if ((ch >= '0' && ch <= '9') || (ch >= 'a' && ch <= 'f') || (ch >= 'A' && ch <= 'F')) {
			System.out.println(ch + " is hexadecimal digit.");
		}
		else {
			System.out.println(ch + " isn't hexadecimal digit.");
		}
		
		sc.close();
	}

}

package If_Else;

import java.util.Scanner;

public class CheckAlphabateTypes {
	public static void main(String[] args) {
		//WAP to check whether a character is a vowel or consonant
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the character (Only alphabets): ");
		char ch = sc.next().charAt(0);
		
		if ((ch >= 'a' && ch <= 'z') || (ch >= 'A' && ch <= 'Z')){
			if ((ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') || (ch == 'A' || ch == 'E' || ch == 'I' || ch == 'O' || ch == 'U')) {
				System.out.println(ch + " is a vowel.");
			}
			else {				
				System.out.println(ch + " is a consonant.");
			}
		} 
		else {
			System.out.println("Not a alphabet character.");
		}
		sc.close();
	}

}

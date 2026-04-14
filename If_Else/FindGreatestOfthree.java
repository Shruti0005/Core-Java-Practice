package If_Else;

import java.util.Scanner;

public class FindGreatestOfthree {
	public static void main(String[] args) {
		//WAP to find greatest of 3 numbers WITHOUT using nested if
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the first value: ");
		int a = sc.nextInt();
		System.out.print("Enter the second value: ");
		int b = sc.nextInt();
		System.out.print("Enter the third value: ");
		int c = sc.nextInt();
		
		if (a >= b && a >= c) {
			System.out.println(a + " is greatest number.");
		}
		else if (b >= a && b >= c) {
			System.out.println(b + " is greatest number.");			
		}
		else {
			System.out.println(c + " is greatest number.");			
		}
		
		sc.close();
	}

}

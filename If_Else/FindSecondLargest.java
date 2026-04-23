package If_Else;

import java.util.Scanner;

public class FindSecondLargest {
	public static void main(String[] args) {
		//WAP to find second largest among 3 numbers
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the first value: ");
		int a = sc.nextInt();
		System.out.print("Enter the second value: ");
		int b = sc.nextInt();
		System.out.print("Enter the third value: ");
		int c = sc.nextInt();
		
		if ((a >= b && a <= c) || (a <= b && a >= c)) {
			System.out.println(a + " is second largest numbers.");
		}
		else if((b >= a && b <= c) || (b <= a && b >= c)) {
			System.out.println(b + " is second largest numbers.");
		}
		else {
			System.out.println(c + " is second largest numbers.");
		}
		sc.close();
	}

}

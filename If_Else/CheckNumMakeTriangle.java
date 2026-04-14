package If_Else;

import java.util.Scanner;

public class CheckNumMakeTriangle {
	public static void main(String[] args) {
		//WAP to check whether 3 numbers can form a triangle or not
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the first value: ");
		int a = sc.nextInt();
		System.out.print("Enter the second value: ");
		int b = sc.nextInt();
		System.out.print("Enter the third value: ");
		int c = sc.nextInt();
		
		if (a <= 0 || b <= 0 || c <= 0) {
			System.out.println("All three value must be positive.");
		}
		else if ((a + b > c) && (b + c > a) && (a + c > b)) {
			System.out.println("Yes, three numbers can form a triangle.");
		}
		else { 
			System.out.println("No, three number can't form a triangle.");
		}
		sc.close();
	}

}

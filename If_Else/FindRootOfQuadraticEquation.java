package If_Else;

import java.util.Scanner;

public class FindRootOfQuadraticEquation {
	public static void main(String[] args) {
		//WAP to find roots of quadratic equation -> condition: discriminant > 0 → real & different = 0 → real & same < 0 → imaginary
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the discriminant value: ");
		int d = sc.nextInt();
		
		if(d > 0) {
			System.out.println(d + " Two real and different roots.");
		}
		else if(d == 0) {
			System.out.println(d + " Real and equal roots");
		}
		else if(d < 0) {
			System.out.println(d + " Imaginary roots");
		}
		
		sc.close();
	}
}

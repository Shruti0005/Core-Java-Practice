package If_Else;

import java.util.Scanner;

public class FindRootOfQuadraticEquation {
	public static void main(String[] args) {
		//WAP to find roots of quadratic equation -> condition: discriminant > 0 → real & different = 0 → real & same < 0 → imaginary
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the value of a: ");
		int a = sc.nextInt();
		System.out.print("Enter the value of b: ");
		int b = sc.nextInt();
		System.out.print("Enter the value of c: ");
		int c = sc.nextInt();
		
		if(a == 0) {
			System.out.println("Not qudratic equation.");
		}
		else {
			int d = (b * b) - (4 * a * c);
			
			if(d > 0) {
				System.out.println(d + " Two real and different roots.");
			}
			else if(d == 0) {
				System.out.println(d + " Real and equal roots");
			}
			else{
				System.out.println(d + " Imaginary roots");
			}
		}
		
		sc.close();
	}
}

package If_Else;

import java.util.Scanner;

public class CreateSimpleCalculator {
	public static void main(String[] args) {
		//WAP to implement a simple calculator using if-else (+ , - , * , / based on user input)
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the first value: ");
		double a = sc.nextDouble();
		System.out.print("Enter the Second value: ");
		double b = sc.nextDouble();
		
		System.out.print("Enter (+, -, *, /) symbol: ");
		char ch = sc.next().charAt(0);
		
		if(ch == '+') {
			System.out.println("Result: " + (a + b));
		}
		else if(ch == '-') {
			System.out.println("Result: " + (a - b));
		}
		else if(ch == '*') {
			System.out.println("Result: " + (a * b));
		}
		else if(ch == '/') {
			if(b == 0) {
				System.out.println("Sorry! 0 can't divide.");
			}
			else {
				System.out.println("Result: " + (a / b));
			}
		}
		else {
			System.out.println("Sorry! there is not symbol here.");
		}
		
		sc.close();
	}

}

package If_Else;

import java.util.Scanner;

public class CheckNumbersEnd {
	public static void main(String[] args) {
		//WAP to check whether a number ends with 0 or 5
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the value: ");
		int num = sc.nextInt();
		
		int lastDigit = Math.abs(num % 10);
		if(lastDigit == 0) {
			System.out.println(num + " ends with 0.");
		}
		else if (lastDigit == 5) {
			System.out.println(num + " ends with 5.");
		}
		else {
			System.out.println(num + " ends with other number.");
		}
		sc.close();
	}

}

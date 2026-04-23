package If_Else;

import java.util.Scanner;

public class CalculateStudentGrade {
	public static void main(String[] args) {
		//WAP to calculate grade of student:
		//90+ → A
		//75–89 → B
		//50–74 → C
		//Below 50 → Fail
		
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter student marks: ");
		int num = sc.nextInt();
		
		if (num >= 90) {
		    System.out.println("A grade");
		}
		else if (num >= 75) {
		    System.out.println("B grade");
		}
		else if (num >= 50) {
		    System.out.println("C grade");
		}
		else {
		    System.out.println("Fail");
		}
		sc.close();
	}

}

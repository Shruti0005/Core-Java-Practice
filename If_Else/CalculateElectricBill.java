package If_Else;

import java.util.Scanner;

public class CalculateElectricBill {
	public static void main(String[] args) {
		//WAP to calculate electricity bill based on units:
		//0–100 → ₹1/unit
		//101–200 → ₹2/unit
		//200+ → ₹3/unit
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the units number: ");
		int unit = sc.nextInt();
		
		int bill = 0;
		if(unit <= 100) {
			bill = unit * 1;
		}
		else if(unit <= 200) {
			bill = (100 * 1) + (unit - 100) * 2;
		}
		else {
			bill = (100 * 1) + (100 * 2) + (unit - 200) * 3;
		}
		
		System.out.println("Total bill: ₹" + bill);
		
		sc.close();
	}

}

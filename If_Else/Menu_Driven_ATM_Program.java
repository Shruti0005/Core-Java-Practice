package If_Else;

import java.util.Scanner;

public class Menu_Driven_ATM_Program {
	public static void main(String[] args) {
		//WAP to implement menu-driven program using if-else (like ATM options: withdraw, deposit, check balance)
		Scanner sc = new Scanner(System.in);
		double balance = 20000;
		int password = 1234;
		System.out.println("1. Check Balance\n" + "2. Deposit\n" + "3. Withdraw\n" + "4. Exit");
		System.out.print("Enter given option number: ");
		int num = sc.nextInt();
		
		System.out.print("Enter your password in digit: ");
		int pass = sc.nextInt();
		if(password == pass) {							
			if(num == 1) {
				System.out.println("Balance: ₹" + balance);
			}
			else if(num == 2) {
				System.out.print("Add your amount: ₹");
				double amount = sc.nextDouble();
				if(amount > 0) {
					balance = amount + balance;
					System.out.println("Updated Balance: ₹" + balance);
				}
				else {
					System.out.println("Invalid amount.");
				}
			}
			else if(num == 3) {
				System.out.print("Enter amount of withdrawal: ");
				double amount = sc.nextDouble();
				if(amount > 0 && amount <= balance) {
					balance = balance - amount;
					System.out.println("Insufficient Balance: ₹" + Math.abs(balance));
				}
				else {
					System.out.println("Insufficiant balance you can't withdraw.");
				}
			}
			else if(num == 4) {
				System.out.println("Thank you for using our ATM.");
			}
			else {
				System.out.println("Invalid choice.");
			}
		}
		else {
			System.out.println("Incorrect Password. Please try again.");
		}
		sc.close();
	}

}

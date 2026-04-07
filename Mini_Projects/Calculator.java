Package Mini_Projects;

import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        //Smart Console Calculator
        Scanner sc = new Scanner(System.in);
        String again = "y";

        while (again.equalsIgnoreCase("y")) {
            System.out.print("Enter the first number: ");
            double num1 = sc.nextDouble();
            System.out.print("\nEnter the second number: ");
            double num2 = sc.nextDouble();

            System.out.print("\nChose operator (+, -, *, /): ");
            char operator = sc.next().charAt(0);

            //Addition
            if (operator == '+') {
                System.out.println("Result: " + (num1 + num2));
            }
            //Subtraction
            else if (operator == '-') {
                System.out.println("Result: " + (num1 - num2));
            }
            //Multiplication
            else if (operator == '*') {
                System.out.println("Result: " + (num1 * num2));
            }
            //Division
            else if (operator == '/') {
                if (num2 == 0) {
                    System.out.println("Sorry! we can't divide 0.");
                }
                else{
                    System.out.println("Result: " + (num1 / num2));
                }
            }
            else{
                System.out.println("Invalid Operator!");
            }

            System.out.print("Do you want to calculate again then type (y/n): ");
            again = sc.next();
        }
        System.out.println("Thank you for using calculator.");
        sc.close();
    }
}

package Switch;

import java.util.Scanner;

public class PrintWorkingNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number");
        int num = sc.nextInt();
        switch (num) {
            case 01:
                System.out.println("Sunday is not a working day");
                break;
            case 02:
                System.out.println("Monday is a working day");
                break;
            case 03:
                System.out.println("Tuesday is a working day");
                break;
            case 04:
                System.out.println("Wednsday is a working day");
                break;
            case 05:
                System.out.println("Thursday is a working day");
                break;
            case 06:
                System.out.println("Friday is a working day");
                break;
            case 07:
                System.out.println("Saturday is not a working day");
                break;
            default:
                System.out.println("Invalide number!");
                break;
        }
        sc.close();
    }
}

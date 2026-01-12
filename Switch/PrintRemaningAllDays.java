package Switch;

import java.util.Scanner;

public class PrintRemaningAllDays {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number");
        int num = sc.nextInt();
        switch (num) {
            case 1:
                System.out.println("S,M,T,W,T,F,S");
                break;
            case 2:
                System.out.println("M,T,W,T,F,S");
                break;
            case 3:
                System.out.println("T,W,T,F,S");
                break;
            case 4:
                System.out.println("W,T,F,S");
                break;
            case 5:
                System.out.println("T,F,S");
                break;
            case 6:
                System.out.println("F,S");
                break;
            case 7:
                System.out.println("S");
                break;
            default:
                System.out.println("Invalid number!");
                break;
        }
        sc.close();
    }
}

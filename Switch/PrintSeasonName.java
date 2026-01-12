package Switch;

import java.util.Scanner;

public class PrintSeasonName {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number");
        int num = sc.nextInt();
        switch (num) {
            case 12:
            case 1:
            case 2:
                System.out.println("Winter");
                break;
            case 3:
            case 4:
            case 5:
                System.out.println("Summer");
                break;
            case 6:
            case 7:
            case 8:
                System.out.println("Rainy");
                break;
            case 9:
            case 10:
            case 11:
                System.out.println("Spring");
                break;
            default:
                System.out.println("Invalid number!");
                break;
        }
        sc.close();
    }
}

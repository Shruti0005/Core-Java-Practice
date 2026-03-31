package Loops;

import java.util.Scanner;

public class PrintPerfectSquareGivenPosition {
    public static void main(String[] args) {
         //WAP TO PRINT PEFECT SQUARE BY READING IT'S POSITION OF NUMBER ?
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the position: ");
        int n = sc.nextInt();

        int i = 1;
        int count = 0;
        while (true) {
            boolean check = false;
            for (int j = 1; j <= i; j++) {
                if (j * j == i) {
                    check = true;
                }
            }
            if (check) {
                count++;
            }
            if (count == n) {
                System.out.println(i);
                break;
            }
            i++;
        }
        sc.close();
    }
}

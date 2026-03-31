package Loops;

import java.util.Scanner;

public class PrintPrimeGivenPosition {
    public static void main(String[] args) {
        //WAP TO PRINT PRIME NUMBER BY READING IT'S POSITION OF NUMBER ?
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the postion: ");
        int n = sc.nextInt();
        int i = 2;
        int count = 0;
        while (true) {
            int fact = 0;
            for (int j = 1; j <= i; j++) {
                if (i % j == 0) {
                    fact++;
                }
            }
            if (fact == 2) {
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

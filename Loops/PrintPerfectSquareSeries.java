package Loops;

import java.util.Scanner;

public class PrintPerfectSquareSeries {
    public static void main(String[] args) {
        //WAP TO PRINT PERFECT SQUARE NUMBERS BEWEEN M AND N ?
        Scanner sc = new Scanner(System.in);
        int m = sc.nextInt();
        int n = sc.nextInt();
        for (int i = m; i <= n; i++) {
            boolean check = false;
            for (int j = 1; j <= i; j++) {
                if (j * j == i) {
                    check = true;
                }
            }
            if (check) {
                System.out.println(i);
            }
        }
        sc.close();
    }
}

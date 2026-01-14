package Loops;

import java.util.Scanner;

public class PrintPrimeSeries {
    public static void main(String[] args) {
        //WAP TO PRINT PRIME NUMBERS BEWEEN M AND N ?
        Scanner sc = new Scanner(System.in);
        int m = sc.nextInt();
        int n = sc.nextInt();
        for (int i = m; i <= n; i++) {
            int count = 0;
            for (int j = 1; j <= i; j++) {
                if (i % j == 0) {
                    count++;
                }
            }
            if (count == 2) {
                System.out.println(i);
            }
        }
        sc.close();
    }
}

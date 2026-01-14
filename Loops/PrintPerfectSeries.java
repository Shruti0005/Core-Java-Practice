package Loops;

import java.util.Scanner;

public class PrintPerfectSeries {
    public static void main(String[] args) {
        //WAP TO PRINT PERFECT NUMBERS BEWEEN M AND N ?
        Scanner sc = new Scanner(System.in);
        int m = sc.nextInt();
        int n = sc.nextInt();
        for(int i = m; i <= n; i++){
            int sum = 0;
            for (int j = 1; j <= i/2; j++) {
                if (i % j == 0) {
                    sum = sum + j;
                }
            }
            if (i==sum) {
                System.out.println(i);
            }
        }
        sc.close();
    }
}
